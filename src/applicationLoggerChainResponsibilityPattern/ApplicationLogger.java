package applicationLoggerChainResponsibilityPattern;

public class ApplicationLogger {
    static int INFO = 1;
    static int DEBUG = 2;
    static int ERROR = 3;
    ApplicationLogger nextLogger;
    public ApplicationLogger(ApplicationLogger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public void log(int logLevel, String message) {
        if (this.nextLogger != null) {
            this.nextLogger.log(logLevel, message);
        }
    }

}
