package maven.Tools;

import maven.Config.Config;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

/**
 * Created by yurii.mizin on 9/10/2015.
 */
public class TestBase {
    protected static WebDriver driver;
    protected static StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        //driver.quit(); // comment to view results
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public static WebElement find(String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        return element;
    }

    public static List<WebElement> findAll(String locator) {
        List<WebElement> elements = driver.findElements(By.xpath(locator));
        return elements;
    }

    public static void goToPage(String link) {
        driver.get(link);
    }

    public static void goToLogin() {
        goToPage(Config.urlLogin);
    }

    public static void goToHome() {
        goToPage(Config.urlHome);
    }

    public static void goToAdmin() {
        goToPage(Config.urlAdmin);
    }

    public static void inputTextfield(String locator, String text) {
        WebElement element = find(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public static void inputTextfieldEnter(String locator, String text) {
        WebElement element = find(locator);
        element.click();
        element.clear();
        element.sendKeys(text + Keys.RETURN);
    }

    public static void click(String locator) {
        WebElement element = find(locator);
        element.click();
    }

    public static boolean getCheckboxState(String locator) {
        /*WebElement checkbox = find(locator);
        String value = checkbox.getAttribute("value");
        if (value.equals("1") || value.equals("Y")) {
            return true;
        }
        else {
            return false;
        }*/
        return find(locator).isSelected();
    }

    public static void setCheckboxOn(String locator) {
        if (!find(locator).isSelected()) {
            click(locator);
        }
    }

    public static void setCheckboxOff(String locator) {
        if (find(locator).isSelected()) {
            click(locator);
        }
    }

    public static void selectFromDropdownByText(String selectLocator, String optionLabel) {
        String optionLocator = selectLocator + "/option[@label='" + optionLabel + "']";
        find(optionLocator).click();
    }

    public static void selectFromDropdownWithSearchByText(String locator, String text) {
        click(locator);
        String xPathInput = "//input[@class='selectPopupSearchField']";
        find(xPathInput).sendKeys(text + Keys.RETURN);
    }

    public static void selectFromFilterDropdown(String linkLocator, String text) {
        click(linkLocator);
        String xPathInput = "//input[@class='select2-input select2-focused']";
        find(xPathInput).sendKeys(text + Keys.RETURN);
    }

    public static void addTopic(String locator, String topic) {
        WebElement input = find(locator);
        input.click();
        input.sendKeys(topic);
        input.sendKeys(Keys.RETURN);
    }

    public static boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException Ex) {
            return false;
        }
    }

    public static void popupApprove() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void ifPopupApprove() {
        if (isAlertPresent()) {
            popupApprove();
        }
    }

    public static void popupDismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public static void ifPopupDismiss() {
        if (isAlertPresent()) {
            popupDismiss();
        }
    }

    /*public static void isElementHasParameterValue(WebElement element, String param, String value) {
        String parameterText = element.getAttribute(param);
        assertTrue(parameterText.equals(value));
    }*/

    public static void isElementHasParameterValue(String locator, String param, String value) {
        WebElement element = find(locator);
        String parameterText = element.getAttribute(param);
        assertTrue(parameterText.equals(value));
    }
}