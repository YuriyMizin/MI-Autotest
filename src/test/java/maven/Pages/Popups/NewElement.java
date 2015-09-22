package maven.Pages.Popups;

import maven.Tools.TestBase;
//import org.apache.xpath.operations.String;

/**
 * Created by yurii.mizin on 9/10/2015.
 */
public abstract class NewElement extends GeneralPopup {
    // Popup form
    public static final String xPathPopup = "//div[@id='selectFormPopup']";

    // Popup title
    public static final String xPathPopupTitle = "//div[contains(.,'Select the type of new element')]";

    // Options
    public static final String xPathMetric = xPathPopup + "//input[@id='metric']";
    public static final String xPathMultiMetric = xPathPopup + "//input[@id='multimetric']";
    public static final String xPathReport = xPathPopup + "//input[@id='report']";
    public static final String xPathExternal = xPathPopup + "//input[@id='extreport']";
    public static final String xPathOther = xPathPopup + "//input[@id='other']";

    // Selector
    public static void selectMetric() {
        click(xPathMetric);
    }
    public static void selectMultiMetric() {
        click(xPathMultiMetric);
    }
    public static void selectReport() {
        click(xPathReport);
    }
    public static void selectExternal() {
        click(xPathExternal);
    }
    public static void selectOther() {
        click(xPathOther);
    }

    // Use Wizard checkbox
    public static final String xPathUseWizard = xPathPopup + "//input[@id='use_wizard']";

    public static void setUseWizardOn() {
        setCheckboxOn(xPathUseWizard);
    }

    public static void setUseWizardOff() {
        setCheckboxOff(xPathUseWizard);
    }
}
