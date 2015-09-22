package maven.Pages.MetricEditor;

import maven.Pages.Popups.DataCollectionParametersPopup;
import maven.Pages.Popups.ParametersSubstitutionPopup;

/**
 * Created by yurii.mizin on 9/15/2015.
 */
public abstract class DataTab extends MetricEditorPage {
    // Data Source -> Select
    public static final String xPathDataSourceSelect = "//select[@id='data_source']";
    // Select Data Source
    public static void setDataSource(String value) {
        selectFromDropdownByText(xPathDataSourceSelect, value);
    }

    // Data Collection Schedule -> Select
    public static final String xPathDataCollectionSchedule = "//select[@id='update_trigger_event_id']";
    // Set Data Collection Schedule
    public static void setDataCollectionSchedule(String value) {
        selectFromDropdownByText(xPathDataCollectionSchedule, value);
    }

    // Data Collection Trigger -> Select
    public static final String xPathDataCollectionTriggerSelect = "//select[@id='update_trigger_event_id']";
    // Select Data Collection Trigger
    public static void setDataCollectionTrigger(String value) {
        selectFromDropdownByText(xPathDataCollectionTriggerSelect, value);
    }

    // SQL statement -> Input
    public static final String xPathSQLStatementInput = "//textarea[@id='data_fetch_command']";
    public static void setSQLStatement(String value) {
        inputTextfield(xPathSQLStatementInput, value);
    }

    // Validate Statement button
    public static final String xPathValidateStatementButton = "//button[@id='validation_button']";
    // Validate Statement
    public static void validateStatement() {
        click(xPathValidateStatementButton);
    }

    // Collect Data -> link
    public static final String xPathCollectData = "//a[@id='metric_collect_data']";
    // Collect Data
    public static void collectData() {
        click(xPathCollectData);
    }


    // SQL Builder link
    public static final String xPathSQLBuilderLink = "//a[@id='showSQLBuilder']";
    // SQL Builder
    public static void runSQLBuilder() {
        click(xPathSQLBuilderLink);
    }

    // Change This Value link
    public static final String xPathChangeThisValue = "//a[@id='a_change_subst_val_link']";
    // Change This Value
    public static void changeThisValue() {
        click(xPathChangeThisValue);
    }

    // Data values are -> Integer -> Input
    public static final String xPathDataValuesAreIntegerInput = "//input[@id='metric_value_type-int']";
    // Data values are -> Decimal -> Input
    public static final String xPathDataValuesAreDecimalInput = "//input[@id='metric_value_type-float']";
    // Select Data Values Are
    public static void setDataValuesAre(String option) {
        if (option.equals("integer")) {
            click(xPathDataValuesAreIntegerInput);
        }
        else {
            click(xPathDataValuesAreDecimalInput);
        }
    }

    // Omit current day from chart -> Yes -> Input
    public static final String xPathOmitCurrentDayYesInput = "//input[@id='omit_partial_periods_ind-Y']";
    // Omit Current Month
    public static void omitCurrentMonth() {
        click(xPathOmitCurrentDayYesInput);
    }
    // Omit current day from chart -> No -> Input
    public static final String xPathOmitCurrentDayNoInput = "//input[@id='omit_partial_periods_ind-N']";
    // Not Omit Current Month
    public static void omitNotCurrentMonth() {
        click(xPathOmitCurrentDayNoInput);
    }
    // Set Omit Current Month From Chart
    public static void setOmitCurrentMonth(String option) {
        if (option.equals("yes")) {
            omitCurrentMonth();
        }
        else {
            omitNotCurrentMonth();
        }
    }

    // On Data Collection Also Re-run Last -> Input
    public static final String xPathOnDataCollectionAlsoRerunLast = "//input[@id='data_collection_refetch_interval']";
    // Set Data Collection Also Re-run Last
    public static void setOnDataCollectionAlsoRerunLast(String value) {
        inputTextfield(xPathOnDataCollectionAlsoRerunLast, value);
    }

    // Omit future months -> yes -> Input
    public static final String xPathOmitFutureMonthsYesInput = "//input[@id='omit_future_periods_ind-Y']";
    // Omit future months
    public static void omitFutureMonths() {
        click(xPathOmitFutureMonthsYesInput);
    }

    // Omit future months -> no -> Input
    public static final String xPathOmitFutureMonthsNoInput = "//input[@id='omit_future_periods_ind-N']";
    // Omit not future months
    public static void omitNotFutureMonths() {
        click(xPathOmitFutureMonthsNoInput);
    }

    // Set Omit Future Months
    public static void setOmitFutureMonths(String option) {
        if (option.equals("yes") || option.equals("true") || option.equals("1")) {
            omitFutureMonths();
        }
        else {
            omitNotFutureMonths();
        }
    }

    // On data collection also re-run last -> Input
    public static final String xPathRerunLastInput = "//input[@id='data_collection_refetch_interval']";
    // Set Re-run Last
    public static void setRerunLast(String last) {
        inputTextfield(xPathRerunLastInput, last);
    }

    // Fill Metric Data form
    public static void fillNewMetricFormData(String[] metricData) {
        setDataSource(metricData[0]);
        setDataCollectionTrigger(metricData[1]);
        setSQLStatement(metricData[2]);
        setDataValuesAre(metricData[5]);

        validateStatement();
        ParametersSubstitutionPopup.setLastMeasurementTime(metricData[3]);
        ParametersSubstitutionPopup.setProductCategory(metricData[4]);
        ParametersSubstitutionPopup.select();

        setOmitCurrentMonth(metricData[6]);
        setOnDataCollectionAlsoRerunLast(metricData[8]);
    }
}