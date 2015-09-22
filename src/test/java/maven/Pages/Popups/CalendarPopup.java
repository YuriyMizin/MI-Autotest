package maven.Pages.Popups;

import maven.Tools.TestBase;

/**
 * Created by yurii.mizin on 9/18/2015.
 */
public abstract class CalendarPopup extends TestBase {
    // Calendar div
    //public static final String xPathDiv = "//div[@class='xdsoft_datepicker active']";
    public static final String xPathDiv = "//div[@class='xdsoft_datetimepicker xdsoft_ xdsoft_noselect' and @style]";

    // Calendar buttons
    public static final String xPathButtons = xPathDiv + "//div[@class='xdsoft_mounthpicker']";

    // Previous button
    public static final String xPathPrevButton = xPathButtons + "/button[@class='xdsoft_prev']";
    public static void prev() {
        click(xPathPrevButton);
    }

    // Next button
    public static final String xPathNextButton = xPathButtons + "/button[@class='xdsoft_next']";
    public static void next() {
        click(xPathNextButton);
    }

    // Today button
    public static final String xPathTodayButton = xPathButtons + "/button[@class='xdsoft_today_button']";
    public static void today() {
        click(xPathTodayButton);
    }

    // Month button
    public static final String xPathMonthButton = xPathButtons + "/div[@class='xdsoft_label xdsoft_month']";
    // Month list
    public static final String xPathMonthList = xPathMonthButton + "/div/div/div";
    // Select month
    public static void setMonth(String month) {
        click(xPathMonthButton);
        click(xPathMonthList + "[contains(.,'" + month + "')]");
    }

    // Year button
    public static final String xPathYearButton = xPathButtons + "/div[@class='xdsoft_label xdsoft_year']";
    // Year list
    public static final String xPathYearList = xPathYearButton + "/div/div/div";
    // Select month
    public static void setYear(String year) {
        click(xPathYearButton);
        click(xPathYearList + "[contains(.,'" + year + "')]");
    }

    // Date table
    public static final String xPathDaysTable = xPathDiv + "//div[@class='xdsoft_calendar']//tbody//td";
    // Select day
    public static void setDay(String day) {
        click(xPathDaysTable + "[@data-date='" + day + "']/div");
    }

    public static void selectDate(String year, String month, String day) {
        if (year.equals("today") || month.equals("today") || day.equals("today")) {
            today();
        }
        else {
            setYear(year);
            setMonth(month);
            setDay(day);
        }
    }
}
