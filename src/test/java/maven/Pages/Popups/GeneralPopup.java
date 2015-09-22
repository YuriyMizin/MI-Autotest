package maven.Pages.Popups;

import maven.Tools.TestBase;

/**
 * Created by yurii.mizin on 9/10/2015.
 */
public abstract class GeneralPopup extends TestBase {
    // Close -> button
    public static final String xPathCloseButton = "//button[@title='close']";
    // Close
    public static void close() {
        click(xPathCloseButton);
    }

    // Next Step -> button
    public static final String xPathNextStepButton = "//button[@id='selectButton']";
    // Press Next Step button
    public static void nextStep() {
        click(xPathNextStepButton);
    }

    // Cancel link
    public static final String xPathCancelLink = "//a[contains(.,'cancel')]";
    // Cancel
    public static void cancel() {
        click(xPathCancelLink);
    }
}
