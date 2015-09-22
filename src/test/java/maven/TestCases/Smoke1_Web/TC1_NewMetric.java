package maven.TestCases.Smoke1_Web;

import maven.Pages.*;
import org.junit.Test;
import maven.Pages.MetricEditor.Advanced;
import maven.Pages.MetricEditor.MetricEditorPage;
import maven.Pages.Popups.DataCollectionParametersPopup;
import maven.Pages.Popups.NewElement;
import maven.Pages.MetricEditor.DataTab;
import maven.TestData.Favorites;
import maven.TestData.Metrics.MetricsInfo;
import maven.TestData.Metrics.MetricsData;
import maven.Tools.TestBase;
import maven.TestData.Credentials;
import maven.Pages.Popups.AddRemovePopup;
import maven.Config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * Created by yurii.mizin on 9/10/2015.
 */
public class TC1_NewMetric extends TestBase {
    @Test
    public void TC1_NewMetric() throws Exception {
        final String[] metricInfo = MetricsInfo.getMetric(Config.version);
        goToLogin();
        Login.loginAs(Credentials.alexl);

        // 1. Create a new dimensioned metric without step-by-step wizard
        goToAdmin();
        Thread.sleep(5000);
        Admin.addAnElement();
        NewElement.selectMetric();
        NewElement.setUseWizardOff();
        NewElement.nextStep();

        // fill all basic fields
        NewMetricPage.fillNewMetricFormInfo(metricInfo);
        NewMetricPage.save();
        TestBase.ifPopupApprove();
        Thread.sleep(5000);

        // and enter the submitted data in fields below:
        MetricEditorPage.switchToDataCollectionTab();
        final String[] metricData = MetricsData.getMetric(Config.version);
        DataTab.fillNewMetricFormData(metricData);

        // 3. Input the correct time in the “Compute Metric Values from:” field. Press ‘Collect data’.
        DataTab.collectData();
        Thread.sleep(20000);
        DataCollectionParametersPopup.fillForm(metricData);
        Thread.sleep(20000);

        // 5*. Open Advanced tab. And set "Attach file to digest" = pdf
        MetricEditorPage.switchToAdvanced();
        Advanced.setAttachFileToDigest("pdf");

        // 6. Check ‘Visible in Dashboard’ and press ‘Enable metric’ button
        MetricEditorPage.setEnabled();
        MetricEditorPage.setVisible();
        ifPopupApprove();
        MetricEditorPage.save();
        Thread.sleep(5000);

        // 7. Create long annotation with link at the beginning,
        // in the middle and at the end of annotation text in Full Preview.

        // 8. Add element to a new Favorite Folder - “Smoke Test Folder” (create while adding to folder)
        MetricEditorPage.updateLiveChart();
        MetricViewerPage.isNotAddedToFavorites();
        MetricViewerPage.addToFavorites();
        AddRemovePopup.selectFavorite(Favorites.TC1);
        AddRemovePopup.saveChanges();
        Thread.sleep(5000);

        // 9. Move to the Home Page and find created dimensioned metric.
        goToHome();
        HomePage.setCategory(Favorites.TC1);
        Thread.sleep(5000);
        HomePage.search(metricInfo[3]);
        Thread.sleep(5000);
        // The tiles of dimension values display on the Home Page.
        List<WebElement> stars = driver.findElements(By.xpath(HomePage.xPathTileFavoriteLink));
        int starsCount = stars.size();
        for (int i=1; i <= starsCount; i++) {
            String star = "(" + HomePage.xPathTileFavoriteLink + ")[" + i + "]";
            isElementHasParameterValue(star, "class", "inFavorites inFavorites_1");
        }

        // 10. Move to Product Category Dimension Editor.
        goToAdmin();
        //Thread.sleep(5000);
        Admin.dimensions();
        Dimensions.search(metricInfo[2]);
        Dimensions.selectElementByName(metricInfo[2]);




    }
}