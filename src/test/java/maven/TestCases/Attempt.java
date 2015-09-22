package maven.TestCases;

import maven.Pages.Admin;
import maven.Pages.Login;
import maven.Pages.Popups.NewElement;
import maven.TestData.Credentials;
import maven.Tools.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by yurii.mizin on 9/14/2015.
 */
public class Attempt extends TestBase {
    @Test
    public void TC1_NewMetric() throws Exception {
        goToLogin();
        Login.loginAs(Credentials.alexl);
        goToAdmin();
        Thread.sleep(5000);
        Admin.addAnElement();
        NewElement.selectMetric();
        NewElement.setUseWizardOff();
        NewElement.nextStep();

        //Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='shared_measure_id']")));
        //dropdown.selectByValue("Sales");

        driver.findElement(By.xpath("//select[@id='shared_measure_id']/option[@label='Sales']")).click();
    }
}
