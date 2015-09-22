package maven.Pages.MetricEditor;

/**
 * Created by yurii.mizin on 9/17/2015.
 */
public abstract class Advanced extends MetricEditorPage {
    // Attach file to digest -> select
    public static final String xPathAttachFileToDigestSelect = "//select[@id='include_content_into_digest_as']";
    // Select Attach file to digest
    public static void setAttachFileToDigest(String option) {
        selectFromDropdownByText(xPathAttachFileToDigestSelect, option);
    }


}
