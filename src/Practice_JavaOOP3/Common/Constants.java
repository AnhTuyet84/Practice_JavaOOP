package Practice_JavaOOP3.Common;

public class Constants {
    public static String browser;
    public static boolean report;
    public static boolean headless;

    public static void setBrowser(String browser) {
        Constants.browser = browser;
    }

    public static void setReport(boolean report) {
        Constants.report = report;
    }

    public static void setHeadless(boolean headless) {
        Constants.headless = headless;
    }

    public static String getBrowser() {
        return browser;
    }

    public static boolean isReport() {
        return report;
    }

    public static boolean isHeadless() {
        return headless;
    }

    public Constants() {

    }
}
