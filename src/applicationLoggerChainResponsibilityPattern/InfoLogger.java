package applicationLoggerChainResponsibilityPattern;

public class InfoLogger extends ApplicationLogger {
    public InfoLogger(ApplicationLogger nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message);
        }
    }

}
