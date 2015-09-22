package maven.Pages.MetricEditor;

import maven.Pages.GeneralTabbedEditor;
import maven.Tools.TestBase;

/**
 * Created by yurii.mizin on 9/15/2015.
 */
public abstract class MetricEditorPage extends GeneralTabbedEditor {
    // Enabled -> input
    public static final String xPathEnabled = "//input[@id='enabled-Y']";
    // Set metric to Enabled
    public static void setEnabled() {
        click(xPathEnabled);
    }

    // Disabled -> input
    public static final String xPathDisabled = "//input[@id='enabled-N']";
    // Set metric to Disabled
    public static void setDisabled() {
        click(xPathDisabled);
    }

    // Visible -> checkbox input
    public static final String xPathVisibleInput = "//input[@id='included']";
    // Set Visible
    public static void setVisible() {
        setCheckboxOn(xPathVisibleInput);
    }
    // Set NOT Visible
    public static void setNotVisible() {
        setCheckboxOff(xPathVisibleInput);
    }

    // Metric Information -> Link
    public static final String xPathMetricInformation = xPathMainTabs + "[@id='top_tab_metric_info']";
    // Switch to Metric Information
    public static void switchToMetricInformationTab() {
        TestBase.find(xPathMetricInformation).click();
    }

    // Data Collection -> Link
    public static final String xPathDataCollection = xPathMainTabs + "[@id='top_tab_metric_calculation']";
    // Switch to Data Collection
    public static void switchToDataCollectionTab() {
        find(xPathDataCollection).click();
    }

    // Stoplights -> Link
    public static final String xPathStoplights = xPathMainTabs + "[@id='top_tab_metric_stoplights']";
    // Switch to Stoplights
    public static void switchToStoplights() {
        find(xPathStoplights).click();
    }

    // Alerting -> Link
    public static final String xPathAlerting = xPathMainTabs + "[@id='top_tab_metric_alerts']";
    // Switch to Alerting
    public static void switchToAlerting() {
        find(xPathAlerting).click();
    }

    // Charting -> Link
    public static final String xPathCharting = xPathMainTabs + "[@id='top_tab_metric_charting']";
    // Switch to Charting
    public static void switchToCharting() {
        find(xPathCharting).click();
    }

    // Associations -> Link
    public static final String xPathAssociations = xPathMainTabs + "[@id='top_tab_metric_aggregate']";
    // Switch to Charting
    public static void switchToAssociations() {
        find(xPathAssociations).click();
    }

    // Advanced -> Link
    public static final String xPathAdvanced = xPathMainTabs + "[@id='top_tab_metric_associations']";
    // Switch to Charting
    public static void switchToAdvanced() {
        find(xPathAdvanced).click();
    }
}
