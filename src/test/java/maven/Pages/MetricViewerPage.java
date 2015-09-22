package maven.Pages;

/**
 * Created by yurii.mizin on 9/17/2015.
 */
public abstract class MetricViewerPage extends GeneralPage {
    // Add to Favorites -> link
    public static final String xPathFavoritesLink = "//a[@id='a_fav_link']";

    public static void isAddedToFavorites() {
        isElementHasParameterValue(xPathFavoritesLink, "class", "remove_fav_link");
    }
    public static void isNotAddedToFavorites() {
        isElementHasParameterValue(xPathFavoritesLink, "class", "fav_link");
    }

    public static void addToFavorites() {
        click(xPathFavoritesLink);
    }


    // Add Annotation -> link
    public static final String xPathAddAnnotationLink = "//a[@id='addFutureAnnotation']";
    // Add Annotation
    public static void addAnnotation() {
        click(xPathAddAnnotationLink);
    }

    // Add Event -> Link
    public static final String xPathAddEventLink = "//a[@id='addFutureEvent']";
    // Add Event
    public static void addEvent() {
        click(xPathAddEventLink);
    }
}
