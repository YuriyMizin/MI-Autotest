package maven.Pages;

/**
 * Created by yurii.mizin on 9/21/2015.
 */
public abstract class HomePage extends GeneralPage {
    // Home page Frame
    public static final String xPathFrame = "//body/div[@class='frame']";
    // Top Menu
    public static final String xPathTopMenu = xPathFrame + "/div[@class='top_menu']";
    // Left part
    public static final String xPathLeft = "//td[@id='hierarchyTd']";
    // Hierarchy Panel
    public static final String xPathHierarchyPanel = xPathLeft + "/div[@id='hierarchyPanel']";
    // Hierarchy Tree
    public static final String xPathHierarchyTree = xPathHierarchyPanel + "/div[@id='hierarchy_tree']";
    // Right part
    public static final String xPathRight = "//td[@id='rightTd']/div[@id='rightTdDiv']";
    // Filter panel
    public static final String xPathFilterPanel = xPathRight + "/div[@id='filterPanel']";
    // Dashboard Header Text
    public static final String xPathDashboardHeader = xPathFilterPanel + "/div[@id='dashboardHeaderText']";
    // View Switcher panel
    public static final String xPathFilterPanelSwitcher = xPathDashboardHeader +
            "/div[@id='tileViewSwitcher']";
    // View Switchers -> Tile link
    public static final String xPathTileLink = "//a[@id='tileViewLink']";
    // Switch to Tile view
    public static void tile() {
        click(xPathTileLink);
    }
    // View Switchers -> Collaborate link
    public static final String xPathCollaborateLink = "//a[@id='collaborativeViewLink']";
    public static void collaborate() {
        click(xPathCollaborateLink);
    }

    // Search div
    public static final String xPathSearch = xPathFilterPanel + "/div[@id='searchboxdiv']";
    // Search -> Input
    public static final String xPathSearchInput = "//input[@id='searchBox']";
    public static void search(String text) {
        inputTextfield(xPathSearchInput, text);
    }
    // Search -> Button
    public static final String xPathSearchButton = "//button[@id='searchClear']";
    // Clear Search
    public static void clearSearch() {
        click(xPathSearchButton);
    }

    // Filters div
    public static final String xPathFilters = xPathFilterPanel + "/div[@class='filters_div']";

    // Category -> Label
    public static final String xPathCategoryLabel = "//div[@class='filter_name' and contains(.,'Category:')]";
    // Category -> Link
    public static final String xPathCategoryLink = "//div[@id='s2id_categoryFilter']/a";
    // Select Category
    public static void setCategory(String value) {
        selectFromFilterDropdown(xPathCategoryLink, value);
    }
    // Category -> Reset
    public static final String xPathCategoryReset = "//a[@data-reset='categoryFilter']";
    public static void resetCategory() {
        click(xPathCategoryReset);
    }

    // Topic -> Label
    public static final String xPathTopicLabel = "//div[@class='filter_name' and contains(.,'Topic:')]";
    // Topic -> Link
    public static final String xPathTopicLink = "//div[@id='s2id_topicFilter']/a";
    // Select Category
    public static void setTopic(String value) {
        selectFromFilterDropdown(xPathTopicLink, value);
    }
    // Topic -> Reset
    public static final String xPathTopicReset = "//a[@data-reset='topicFilter']";
    public static void resetTopic() {
        click(xPathTopicReset);
    }

    // Filter by -> Label
    public static final String xPathFilterByLabel = "//div[@class='filter_name' and contains(.,'Filter by:')]";
    // Filter by -> Link
    public static final String xPathFilterByLink = "//div[@id='s2id_segmentFilter']/a";
    // Select Category
    public static void setFilterBy(String value) {
        selectFromFilterDropdown(xPathFilterByLink, value);
    }
    // Filter by -> Reset
    public static final String xPathFilterByReset = "//a[@data-reset='segmentFilter']";
    public static void resetFilterBy() {
        click(xPathFilterByReset);
    }

    // Group by -> Label
    public static final String xPathGroupByLabel = "//div[@class='filter_name' and contains(.,'Group by:')]";
    // Group by -> Link
    public static final String xPathGroupByLink = "//div[@id='s2id_groupBy']/a";
    // Select Category
    public static void setGroupBy(String value) {
        selectFromFilterDropdown(xPathGroupByLink, value);
    }
    // Group by -> Reset
    public static final String xPathGroupByReset = "//a[@data-reset='groupBy']";
    public static void resetGroupBy() {
        click(xPathGroupByReset);
    }

    // Display period -> Label
    public static final String xPathDisplayPeriodLabel = "//div[@class='filter_name' and contains(.,'Display period:')]";
    // Display period -> Link
    public static final String xPathDisplayPeriodLink = "//div[@id='s2id_commentaryFilter']/a";
    // Select Display Period
    public static void setDisplayPeriod(String value) {
        selectFromFilterDropdown(xPathDisplayPeriodLink, value);
    }
    // Display period -> Reset
    public static final String xPathDisplayPeriodReset = "//a[@data-reset='commentaryFilter']";
    public static void resetDisplayPeriod() {
        click(xPathDisplayPeriodReset);
    }

    // Clear All button
    public static final String xPathClearAllButton = "//button[@class='filters_div_clear_all_a trt gray btn btn-small']";
    public static void clearAll() {
        click(xPathClearAllButton);
    }

    // Main Content
    public static final String xPathMainContent = xPathRight + "/div[@id='mainContent']";

    // Tiles Panel
    public static final String xPathTilesPanel = xPathMainContent + "/div[@id='tilesPanel']/div[@id='tilesInner']";

    // One of the Tiles
    public static final String xPathTile = "//div[@id='tilesInner']/div";

    // Tile -> Top buttons
    public static final String xPathTileButtons = "//div[@id='tilesInner']/div/dt";

    // Favorite "Star" links
    public static final String xPathTileFavoriteLink = "//div[@id='tilesInner']/div//dl/dt/a[1]";

    // Tile -> Title
    public static final String xPathTileTitle = "//a[@class='dt_title_link']";
}