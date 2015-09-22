package maven.TestData.Metrics;

/**
 * Created by yurii.mizin on 9/11/2015.
 */
public abstract class MetricsInfo {
    public static final String[] metric33 = {
            "Customers", // Measure of [0]
            "Monthly", // Measured [1]
            "Product Category", // Dimension it by [2]
            "! Metric Smoke1_TC1_NewMetric", // Name [3]
            "! Metric Smoke1_TC1_NewMetric - Description", // Description [4]
            "Uncategorized", // Category [5]
            "Audit Metrics", // Topics [6]
            "XXX", // The units are in [7]
            "! TC1_NewMetric", // A shorter name for this is [8]
            "A (111@gmail.com)", // Business Owner [9]
            "A (111@gmail.com)"  // Technical Owner [10]
    };

    public static final String[] metric40 = { // Monthly Sales by Channel
            "Sales", // Measure of [0]
            "Monthly", // Measured [1]
            "Not Dimensioned", // Dimension it by [2]
            "! Metric Smoke1_TC1_NewMetric 4.0", // Name [3]
            "TC1_NewMetric 4.0 - Monthly Sales by Channel", // Description [4]
            "bk test stuff", // Category [5]
            "Customer Count", // Topics [6]
            "XXX", // The units are in [7]
            "! TC1_NewMetric 4.0", // A shorter name for this is [8]
    };

    public static String[] getMetric(int version) {
        String[] metric;
        switch (version) {
            case 33: metric = metric33;
                break;
            case 40: metric = metric40;
                break;
            default: metric = metric40;
        }
        return metric;
    }
}