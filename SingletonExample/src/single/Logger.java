package single;

public class Logger {
    private static Logger single_instance = null;

    // Private constructor to prevent instantiation
    private Logger() {}

    // Static method to provide the singleton instance
    public static Logger getInstance() {
        if (single_instance == null) {
            single_instance = new Logger();
        }
        return single_instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
