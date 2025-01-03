package applicationLoggerChainResponsibilityPattern;

public class ErrorLogger extends ApplicationLogger {
    public ErrorLogger(ApplicationLogger nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("Error: " + message);
        } else {
            super.log(logLevel, message);
        }
    }

}
