package maven.Pages;

import maven.Tools.TestBase;

/**
 * Created by yurii.mizin on 9/11/2015.
 */
public abstract class NewMetricPage extends GeneralEditor {
    // Page Title
    public static final String title = "New Metric";

    // Metric Information page Title
    public static final String xPathTitle = "//h1[contains(.,'Metric Information')]";

    // Measure of -> Select
    public static final String xPathMeasureOfSelect = "//select[@id='shared_measure_id']";
    // Measure of -> Input
    public static final String xPathMeasureOfInput = "//input[@id='prev_shared_measure_id']";
    // Select Measure Of option
    public static void setMeasureOf(String option) {
        selectFromDropdownByText(xPathMeasureOfSelect, option);
    }

    // Measure of: Add New Measure button
    public static final String xPathMeasureOfAddNewMeasureButton =
            "//button[@onclick=\"ed.showAddItemPopup('shared_measure_id');return false;\"]";
    // Add New Measure
    public static void addNewMeasure() {
        click(xPathMeasureOfAddNewMeasureButton);
    }

    // Measured: Select
    public static final String xPathMeasuredSelect = "//select[@id='measurement_interval_id']";
    // Select Measured option
    public static void setMeasured(String option) {
        selectFromDropdownByText(xPathMeasuredSelect, option);
    }

    // Dimension it by: Select
    public static final String xPathDimensionItBySelect = "//select[@id='segment_id']";
    // Select Dimension It By option
    public static void setDimensionItBy(String option) {
        selectFromDropdownByText(xPathDimensionItBySelect, option);
    }

    // Name -> Input
    public static final String xPathNameInput = "//input[@id='name']";
    // Set Name
    public static void setName(String text) {
        inputTextfield(xPathNameInput, text);
    }

    // Description -> Input
    public static final String xPathDescriptionInput = "//textarea[@id='description']";
    // Set Description
    public static void setDescription(String text) {
        inputTextfield(xPathDescriptionInput, text);
    }

    // Category -> Select
    public static final String xPathCategorySelect = "//select[@id='category_id']";
    // Select Category option
    public static void setCategory(String option) {
        selectFromDropdownByText(xPathCategorySelect, option);
    }

    // Topics -> Textarea
    public static final String xPathTopicsInput = "//textarea[@id='topics']";
    // Set Description
    public static void addTopic(String text) {
        addTopic(xPathTopicsInput, text);
    }

    // The units are in -> Input
    public static final String xPathTheUnitsAreInInput = "//input[@id='metric_unit_of_measure']";
    // Set The units are in
    public static void setTheUnitsAreIn(String text) {
        inputTextfield(xPathTheUnitsAreInInput, text);
    }

    // A shorter name for this is: Input
    public static final String xPathShorterNameInput = "//input[@id='metric_display_label']";
    // Set A shorter name for this is
    public static void setShorterName(String text) {
        inputTextfield(xPathShorterNameInput, text);
    }

    // Business Owner -> select
    public static final String xPathBusinessOwnerSelect = "//select[@id='business_owner_id']";
    // Business Owner -> input
    public static final String xPathBusinessOwnerInput = "//input[@id='business_owner_id_selectPopupElement']";
    // Select Business Owner
    public static void setBusinessOwner(String option) {
        selectFromDropdownWithSearchByText(xPathBusinessOwnerInput, option);
    }

    // Technical Owner -> select
    public static final String xPathTechnicalOwnerSelect = "//select[@id='technical_owner_id']";
    // Technical Owner -> input
    public static final String xPathTechnicalOwnerInput = "//input[@id='technical_owner_id_selectPopupElement']";
    // Select Technical Owner
    public static void setTechnicalOwner(String option) {
        selectFromDropdownWithSearchByText(xPathTechnicalOwnerInput, option);
    }

    // Fill New Metric Information form
    public static void fillNewMetricFormInfo(String[] metric) {
        setMeasureOf(metric[0]);
        setMeasured(metric[1]);
        setDimensionItBy(metric[2]);
        setName(metric[3]);
        setDescription(metric[4]);
        setCategory(metric[5]);
        addTopic(metric[6]);
        setTheUnitsAreIn(metric[7]);
        setShorterName(metric[8]);
        setBusinessOwner(metric[9]);
        setTechnicalOwner(metric[10]);
    }
}