package maven.Pages.Popups;

/**
 * Created by yurii.mizin on 9/15/2015.
 */
public abstract class ParametersSubstitutionPopup extends GeneralPopup {
    // Popup form
    public static final String xPathPopup = "//div[@id='substFormPopup']";

    // Last Measurement Time -> Input
    public static final String xPathLastMeasurementTimeInput = "//input[@id='meas_date']";
    // Set Last Measurement Time
    public static void setLastMeasurementTime(String value) {
        inputTextfield(xPathLastMeasurementTimeInput, value);
    }

    // Product Category
    public static final String xPathProductCategorySelect = "//select[@id='segment_value_id']";
    // Select Product Category
    public static void setProductCategory(String value) {
        selectFromDropdownByText(xPathProductCategorySelect, value);
    }

    // Select -> button
    public static final String xPathSelectButton = xPathPopup + "//button[@id='perms']";
    // Select
    public static void select() {
        click(xPathSelectButton);
    }
}
