public class LogLevels {

    public static String message(String logLine) {
        int a = logLine.indexOf(":");
        return logLine.substring(a + 1, logLine.length()).trim();
    }

    public static String logLevel(String logLine) {
        String a[] = logLine.split(":");
        return a[0].replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        String a[] = logLine.split(":");
        String uno = a[0].replaceAll("[ \\[ ]", "(").replaceAll("[ \\] ]", ")").toLowerCase();
        String due = a[1].trim();
        return due + " " + uno;
    }
}
