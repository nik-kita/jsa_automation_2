package main_package.engine.log_engine;

public class Tag {
    public static String hr = "<hr>";
    public static String br = "<br>";

    public static String inPre(String message) {
        return "<pre>" + message + "</pre>";
    }

    public static String inPre(String message, String... cssPairs) {
        return "<pre " + styleBuild(cssPairs) + ">" + message + "</pre>";
    }

    public static String inDiv(String message) {
        return "<div>" + message + "</div>";
    }
    public static String inDiv(String message, String... cssPairs) {
        return "<div " + styleBuild(cssPairs) + ">" + message + "</div>";
    }




    public static String styleBuild(String... cssPairs) {
        String css = " style=\"";
        for(String c : cssPairs) {
            css += c + ";";
        }
        return css + "\"";
    }

}
