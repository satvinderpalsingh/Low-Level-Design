package applicationLoggerChainResponsibilityPattern;

public class DebugLogger extends ApplicationLogger {
    public DebugLogger(ApplicationLogger nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(logLevel, message);
        }
    }

}
