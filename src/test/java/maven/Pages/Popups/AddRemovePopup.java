package maven.Pages.Popups;

import org.openqa.selenium.By;

/**
 * Created by yurii.mizin on 9/21/2015.
 */
public abstract class AddRemovePopup extends GeneralPopup {
    // Popup
    public static final String xPathPopupWrapper = "//body/div[@class='popup_wrapper']";
    public static final String xPathPopup = xPathPopupWrapper +
            "/div/div[@id='elementfavoritePopup']/div[@id='elementfavoritePopupinner']";

    // Popup title
    public static final String xPathPopupTitle = "//div[contains(.,'Add/Remove')]";

    // Close button (X)
    public static final String xPathCloseXButton = "//button[@title='close']";
    public static void close() {
        click(xPathCloseXButton);
    }

    // Popup content
    public static final String xPathPopupContent = xPathPopup + "/div[@class='new_popup_cont']";

    // Favorites list
    public static final String xPathFavoritesList = "//div[@id='favoritesListDiv']/div/ul";

    // Select Favorite by name
    public static void selectFavorite(String name) {
        if (0 == driver.findElements(By.xpath(xPathFavoritesList + "/li[contains(.,'" + name + "')]")).size()) {
            createNewFolder(name);
        }
        else {
            setCheckboxOn(xPathFavoritesList + "/li[contains(.,'" + name + "')]");
        }
    }

    // Deselect Favorite by name
    public static void deselectFavorite(String name) {
        setCheckboxOff(xPathFavoritesList + "/li[contains(.,'" + name + "')]");
    }

    // Create New Folder link
    public static final String xPathCreateNewFolder = "//a[@class='selectable_list_add_a']";

    // press Create New Folder button
    public static void newFolder() {
        click(xPathCreateNewFolder);
    }

    // New Folder name input
    public static final String xPathCreateNewFolderNameInput = "//input[@class='selectable_list_new_input']";
    public static void setCreateNewFolderName(String value) {
        inputTextfieldEnter(xPathCreateNewFolderNameInput, value);
    }

    // New Folder name clear button
    public static final String xPathCreateNewFolderNameClearButton = "//a[@class='selectable_list_new_clear']";
    public static void clearNewFolderName() {
        click(xPathCreateNewFolderNameClearButton);
    }

    // Save Changes button
    public static final String xPathSaveChangesButton = "//button[@id='add_to_section']";
    public static void saveChanges() {
        click(xPathSaveChangesButton);
    }

    // Cancel link
    public static final String xPathCancelLink = "//a[@id='elementfavoritePopupCloseButton']";
    public static void cancel() {
        click(xPathCancelLink);
    }

    // Create New Folder with Name
    public static void createNewFolder(String name) {
        /*if (0 == driver.findElements(By.xpath(xPathFavoritesList + "/li[contains(.,'" + name + "')]")).size()) {
            newFolder();
            setCreateNewFolderName(name);
        }*/
        newFolder();
        setCreateNewFolderName(name);
    }
}
