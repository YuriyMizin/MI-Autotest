package maven.TestData.Metrics;

/**
 * Created by yurii.mizin on 9/15/2015.
 */
public abstract class MetricsData {
    public static final String[] metric33 = {
            "Demo DB (SQL)", // Data Source [0]
            "month-end-refresh", // Data Collection Trigger [1]
            "Select calendar_month.first_day_of_month, Sum(daily_order_summary.total_amount)\n" +
                    "From calendar_month Inner Join calendar_day On calendar_month.month_id = calendar_day.month_id Inner Join\n" +
                    " daily_order_summary On calendar_day.day_id = daily_order_summary.day_id Inner Join\n" +
                    " product On product.product_id = daily_order_summary.product_id\n" +
                    "Where calendar_month.first_day_of_month > :last_measurement_time And\n" +
                    " calendar_month.last_day_of_month < now() And product.product_category = :product_category\n" +
                    "Group By 1", // SQL statement [2]
            "2014-08-08", // Last Measurement Time [3]
            "wine", // Product Category [4]
            "decimal", // Data Values are [5]
            "yes", // Omit current month from chart [6]
            "no", // Omit future months [7]
            "", // On data collection also re-run last <> month(2) [8]
            "2014-08-08", // Collect from [9]
            "wine" // Product category [10]
    };

    public static final String[] metric40 = {
            "Demo DB (SQL)", // Data Source [0]
            "month-end-refresh", // Data Collection Trigger [1]
            "select\n" +
                    "month.month_id, \n" +
                    "month.full_name 'Month Name',\n" +
                    "channel 'Channel',\n" +
                    "sum(total_amount) 'Total Sales Amount'\n" +
                    "from daily_order_summary s,\n" +
                    "calendar_month month\n" +
                    "where s.calendar_date >= month.first_day_of_month\n" +
                    "and s.calendar_date <= month.last_day_of_month\n" +
                    "and date(now()) > month.last_day_of_month\n" +
                    "and month.last_day_of_month > :last_measurement_time\n" + // '2009-12-31' //  :measurement_time
                    "group by 1,2,3;", // SQL statement [2]
            "2014-08-08", // Last Measurement Time [3]
            "wine", // Product Category [4]
            "decimal", // Data Values are [5]
            "yes", // Omit current month from chart [6]
            "no", // Omit future months [7]
            "" // On data collection also re-run last <> month(2) [8]
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
