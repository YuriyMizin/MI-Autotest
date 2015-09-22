package maven.Pages;

/**
 * Created by yurii.mizin on 9/15/2015.
 */
public abstract class GeneralEditor extends GeneralPage {
    // Preview button
    public static final String xPathPreviewButton = "//button[@id='preview_element_btn']";
    // Preview
    public static void preview() {
        click(xPathPreviewButton);
    }

    // Save button
    public static final String xPathSaveButton = "//button[@id='save']";
    // Save
    public static void save() {
        click(xPathSaveButton);
    }

    // Update live chart -> button
    public static final String xPathUpdateLiveChartButton = "";
    // Update live chart
    public static void updateLiveChart() {
        click(xPathUpdateLiveChartButton);
    }
}
