package applicationLoggerChainResponsibilityPattern;

public class ApplicationLoggerMain {
    public static void main(String[] args) {
        ApplicationLogger logger = new ErrorLogger(new InfoLogger(new DebugLogger(null)));
        logger.log(ApplicationLogger.INFO, "This is an information.");
        logger.log(ApplicationLogger.DEBUG, "This is a debug level information.");
        logger.log(ApplicationLogger.ERROR, "This is an error.");   
    }

}
