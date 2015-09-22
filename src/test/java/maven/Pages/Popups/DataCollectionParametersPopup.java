package maven.Pages.Popups;

/**
 * Created by yurii.mizin on 9/16/2015.
 */
public abstract class DataCollectionParametersPopup extends GeneralPopup {
    // Popup form
    public static final String xPathPopup = "//div[@id='segvaluesFormPopup']";

    // Popup title
    public static final String xPathPopupTitle = "//div[contains(.,'Data Collection Parameters')]";

    // Collect From -> Input
    public static final String xPathCollectFromInput = "//input[@id='collect_from']";
    // Set Collect From
    public static void setCollectFrom(String value) {
        inputTextfield(xPathCollectFromInput, value);
    }

    // Product Category -> select
    public static final String xPathProductCategorySelect = "//select[@id='segment_value_id']";
    // Select Product Category
    public static void setProductCategory(String option) {
        selectFromDropdownByText(xPathProductCategorySelect, option);
    }

    // Select -> button
    public static final String xPathSelectButton = xPathPopup + "//button[@id='selectButton']"; // 'perms'
    // Select
    public static void select() {
        click(xPathSelectButton);
    }

    public static void fillForm(String[] metricData) {
        DataCollectionParametersPopup.setCollectFrom(metricData[9]);
        DataCollectionParametersPopup.setProductCategory(metricData[10]);
        DataCollectionParametersPopup.select();
    }
}
