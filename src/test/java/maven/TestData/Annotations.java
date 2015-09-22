package maven.TestData;

/**
 * Created by yurii.mizin on 9/17/2015.
 */
public abstract class Annotations {
    public static final String[] annotation1 = {
            "point", // Annotate: "point" for Data Point / else Time Period [0]
            "2016", // Data On Year or Annotation Start Date Year, example "2016" or "today" [1]
            "October", // Data On Month or Annotation Start Date Month, example "October" or "today" [2]
            "10", // Data On Day or Annotation Start Date Day, example "10" or "today" [3]
            "", // Annotation Finish Date Year [4]
            "", // Annotation Finish Date Month [5]
            "", // Annotation Finish Date Day [6]
            "https://www.google.com\nhttps://www.yandex.com\nhttps://github.com", // Annotation Text [7]
            "yes", // "show" to Show on Other Metrics [8]
    };
}
