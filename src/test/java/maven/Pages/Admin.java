package maven.Pages;

import maven.Tools.TestBase;

/**
 * Created by yurii.mizin on 9/10/2015.
 */
public abstract class Admin extends GeneralPage {
    // Page Title
    public static final String title = "Admin";

    // Admin page Title
    public static final String xPathTitle = "//h1[contains(.,'Admin')]";

    // Admin links table
    public static final String xPathAdminLinksTable = "//table[@class='admin_links']";

    // Elements -> Title
    public static final String xPathElementsTitle = "//h3[contains(.,'Elements')]";

    // Elements -> Add an Element -> link
    public static final String xPathAddAnElementLink = xPathAdminLinksTable + "//a[contains(.,'Add an Element')]";
    // Elements -> Add an Element
    public static void addAnElement() {
        click(xPathAddAnElementLink);
    }

    // Elements -> Elements List -> link
    public static final String xPathElementsListLink = "//a[contains(.,'Elements List')]";
    // Elements -> Elements List
    public static void elementsList() {
        click(xPathElementsListLink);
    }

    // Elements -> Dimensions -> link
    public static final String xPathDimensionsLink = "//a[contains(.,'Dimensions')]";
    // Elements -> Dimensions
    public static void dimensions() {
        click(xPathDimensionsLink);
    }

    // Elements -> Targets -> link
    public static final String xPathTargetsLink = "//a[contains(.,'Targets')]";
    // Elements -> Targets ->
    public static void targets() {
        click(xPathTargetsLink);
    }
}
