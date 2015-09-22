package maven.Pages;

import maven.Tools.TestBase;

/**
 * Created by yurii.mizin on 9/15/2015.
 */
public abstract class GeneralTabbedEditor extends GeneralPage {
    // Main Tabs navigation
    public static final String xPathMainTabs = "//ul[@class='mainTabsNavigation']/li/a";

    // Footer button holder
    public static final String xPathFooterButtonHolder = "//div[@class='main_footer_frame btn_holder']";

    // Save button
    public static final String xPathSaveButton = "//button[@id='save_element']"; //"//button[@id='save']"
    // Save
    public static void save() {
        click(xPathSaveButton);
    }

    // Preview -> Button
    public static final String xPathPreviewButton = "//button[@id='preview_element_btn']";
    // Preview
    public static void preview() {
        click(xPathPreviewButton);
    }

    // Update Live Chart -> Link
    public static final String xPathUpdateLiveChartButton = "//button[@id='enable_element']";
    // Update Live Chart
    public static void updateLiveChart() {
        click(xPathUpdateLiveChartButton);
    }
}