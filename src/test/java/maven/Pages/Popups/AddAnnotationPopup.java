package maven.Pages.Popups;

/**
 * Created by yurii.mizin on 9/18/2015.
 */
public abstract class AddAnnotationPopup extends GeneralPopup {
    // Annotate: Data Point -> Input
    public static final String xPathDataPointInput = "//input[@id='annotation_interval-point']";
    // Select Data Point
    public static void dataPoint() {
        click(xPathDataPointInput);
    }

    // Annotate: Time Period -> Input
    public static final String xPathTimePeriod = "//input[@id='annotation_interval-range']";
    // Select Time Period
    public static void timePeriod() {
        click(xPathTimePeriod);
    }

    // Data on -> Calendar
    public static final String xPathDataOn = "//input[@id='annotation_date_on']";
    // Show Data On calendar
    public static void showDataOnCalendar() {
        click(xPathDataOn);
    }
    // Set Data On date
    public static void setDataOn(String year, String month, String day) {
        showDataOnCalendar();
        CalendarPopup.selectDate(year, month, day);
    }

    // Annotation Start Date -> Calendar
    public static final String xPathStartDate = "//input[@id='annotation_measurement_start_time']";
    // Show Start Date calendar
    public static void showStartDateCalendar() {
        click(xPathStartDate);
    }
    // Set Start Date
    public static void setStartDate(String year, String month, String day) {
        showStartDateCalendar();
        CalendarPopup.selectDate(year, month, day);
    }

    // Annotation Finish Date -> Calendar
    public static final String xPathFinishDate = "//input[@id='annotation_measurement_finish_time']";
    // Show Finish Date calendar
    public static void showFinishDateCalendar() {
        click(xPathFinishDate);
    }
    // Set Finish Date
    public static void setFinishDate(String year, String month, String day) {
        showFinishDateCalendar();
        CalendarPopup.selectDate(year, month, day);
    }

    // Annotation text -> Input
    public static final String xPathAnnotationTextInput = "//textarea[@id='ann_text']";
    // Set Annotation Text
    public static void setAnnotationText(String text) {
        inputTextfield(xPathAnnotationTextInput, text);
    }

    // Show on Other Metrics -> input
    public static final String xPathShowOnOtherMetrics = "//input[@id='group_ind']";
    // Set Show on Other Metrics ON
    public static void setShowOnOtherMetricsOn() {
        setCheckboxOn(xPathShowOnOtherMetrics);
    }
    // Set Show on Other Metrics OFF
    public static void setShowOnOtherMetricsOff() {
        setCheckboxOff(xPathShowOnOtherMetrics);
    }

    public static void fillAnnotationForm(String[] annotation) {
        if (annotation[0].equals("point")) {
            AddAnnotationPopup.dataPoint();
            AddAnnotationPopup.setDataOn(annotation[1], annotation[2], annotation[3]);
        }
        /*else {
            AddAnnotationPopup.timePeriod();
            AddAnnotationPopup.setStartDate(annotation[1], annotation[2], annotation[3]);
            AddAnnotationPopup.setFinishDate(annotation[4], annotation[5], annotation[6]);
        }
        AddAnnotationPopup.setAnnotationText(annotation[7]);
        if (annotation[8].equals("show")) {
            AddAnnotationPopup.setShowOnOtherMetricsOn();
        }
        else {
            AddAnnotationPopup.setShowOnOtherMetricsOff();
        }*/
    }
}
