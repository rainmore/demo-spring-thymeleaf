package net.rainmore.demo.mvc.utils;

//TODO to use path from configuration
public class ViewHelpers {
    private static String defaultViewPath = "pages";
    private static String defaultTemplatePath = "templates";
    private static String defaultTemplate = "default";

    public static String buildViewPath(String viewPage) {
        return String.format("%s/%s", defaultViewPath, viewPage);
    }

    public static String buildTemplatePath(String template) {
        return String.format("%s/%s", defaultTemplatePath, template);
    }

    public static String getTemplatePath() {
        return buildTemplatePath(defaultTemplate);
    }
}
