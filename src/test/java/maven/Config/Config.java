package maven.Config;

/**
 * Created by yurii.mizin on 9/9/2015.
 */
public abstract class Config {
    public static final int version = 33; // 33 Fred / 34 Adam / 40 Bob

    public static final String urlBase = "https://fred.metricinsights.com";
    //public static final String urlBase = "https://adam.metricinsights.com";
    //public static final String urlBase = "https://bob.metricinsights.com"; // 4.0
    //public static final String urlBase = "https://192.168.10.45/auth/index"; // Aleksander's server

    public static final String urlLogin = urlBase + "/login";
    public static final String urlHome = urlBase + "/home";
    public static final String urlAdmin = urlBase + "/admin";
    public static final String urlNewMetricEditor = urlBase + "/editor/metric/draw";

    // Elements
    public static final String urlElementsList = urlBase + "/editor";
    public static final String urlDimensions = urlBase + "/editor/segment";
    public static final String urlTargets = urlBase + "/editor/target";

    // Data
    public static final String urlDataCollectionTriggers = urlBase + "/editor/trigger";
    public static final String urlDataDependencies = urlBase + "/editor/dependency";
    public static final String urlDataSources = urlBase + "/editor/datasource";
    public static final String urlManualMetrics = urlBase + "/editor/manualmetric";
    public static final String urlRemoteCollectors = urlBase + "/editor/remotecollector";

    // Utilities
    public static final String urlConfigVariables = urlBase + "/monitor/variable";
    public static final String urlMetricInsightsStatusMonitor = urlBase + "/monitor";
    public static final String urlSlideShows = urlBase + "/admin/slideshow";
    public static final String urlAPITestTool = urlBase + "/api";
    public static final String urlCompletedImportsExports = urlBase + "/admin/content";

    // Notifications
    public static final String urlAlertRuleProfiles = urlBase + "/admin/alertprofile";
    public static final String urlEventCalendars = urlBase + "/editor/eventcalendar";
    public static final String urlNotificationSchedules = urlBase + "/notification/ns";
    public static final String urlBursts = urlBase + "/notification/dl";

    // Content organization
    public static final String urlCategories = urlBase + "/editor/category";
    public static final String urlMeasurementIntervals = urlBase + "/editor/measurementinterval";
    public static final String urlMeasures = urlBase + "/editor/measure";
    public static final String urlTopics = urlBase + "/editor/topic";

    // Permissions
    public static final String urlGroups = urlBase + "/admin/group";
    public static final String urlUsers = urlBase + "/admin/user";
    public static final String urlExternalApplications = urlBase + "/admin/externalapplication";

    // Templates
    public static final String urlEmailTemplates = urlBase + "/admin/emailtemplate";
    public static final String urlDigestTemplates = urlBase + "/editor/digesttemplate";
    public static final String urlUserPreferenceTemplates = urlBase + "/admin/userpreferencetemplate";
    public static final String urlAlertSubscriptionsTemplates = urlBase + "/admin/alertpreferencetemplate";
    public static final String urlEmailNotificationsTemplates = urlBase + "/admin/notificationpreferencetemplate";
    public static final String urPluginURLTemplates = urlBase + "/editor/purltemplate";
}
