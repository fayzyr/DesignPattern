package responsibility;

/**
 * 构建责任链
 */
public class LoggerChain {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int WARM = 3;
    public static final int ERROR = 4;

    public static AbLogger getLoggerChain() {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();
        ErrorLogger errorLogger = new ErrorLogger();

        //创建责任链,按照逻辑联系，进行链接，最终是一个顺序或倒序的链条，由链条的头部进入，至尾部截止
//正序可以
        //consoleLogger< fileLogger <errorLogger
        consoleLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(errorLogger);
//        (return 链条头部)
        return consoleLogger;

//倒序也可以
        //errorLogger > fileLogger > consoleLogger
//        errorLogger.setNextLogger(fileLogger);
//        //满足fileLogger，必定满足consoleLogger;反之，不满足fileLogger，但是有可能满足consoleLogger
//        fileLogger.setNextLogger(consoleLogger);
//        (return 链条头部)
//                return e rrorLogger;
    }

}
