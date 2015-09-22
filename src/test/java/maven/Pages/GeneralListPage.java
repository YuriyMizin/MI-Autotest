package maven.Pages;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by yurii.mizin on 9/17/2015.
 */
public abstract class GeneralListPage extends GeneralPage {
    // Search -> Input
    public static final String xPathSearchInput = "//input[@id='search']";
    // Search
    public static void search(String value) {
        inputTextfieldEnter(xPathSearchInput, value);
    }

    // List div
    public static String xPathElementsList = "//div[@id='ext-gen95']";

    // List links
    public static String xPathListLinks = "//div[@id='ext-gen95']//a";

    // Select Element from List by Name
    public static void selectElementByName(String name) {
        List<WebElement> elements = findAll(xPathListLinks);
        int elementsCount = elements.size();
        for (int i=1; i <= elementsCount; i++) {
            String link = "(" + xPathListLinks + ")[" + i + "]";
            String linkText = find(link).getText();
            if (linkText.equals(name)) {
                click(link);
                break;
            }
        }
    }

    // Select Element from List by Index
    public static void selectElementByIndex(int index) {
        String xPathElementLink = xPathElementsList + "/div[" + index + "]//a";
        click(xPathElementLink);
    }

    // Universal element locator BY NAME
    public static final String xPathElement = xPathElementsList + "//a";
}
