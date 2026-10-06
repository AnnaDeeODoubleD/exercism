import java.util.Locale;

public class LogLevels {

    public static String message(String logLine) {
        int indexOfColon = logLine.indexOf(":");
        return logLine.substring(indexOfColon + 1).trim();
    }

    public static String logLevel(String logLine) {
        int indexOfClosingBracket = logLine.indexOf("]");
        return logLine.substring(1,indexOfClosingBracket).toLowerCase(Locale.ROOT);
    }

    public static String reformat(String logLine) {
return message(logLine) + " (" + logLevel(logLine) + ")" ;
    }
}
