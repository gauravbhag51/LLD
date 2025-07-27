package Patterns.Behavioural.ChainOfResponsibility;

public class Main {
    public static void main(String[] args){
        LogLogger logLogger = new LogLogger(new DebugLogger(new ErrorLogger()));

        logLogger.log(LogLevel.LOG, "This is a normal log");
        logLogger.log(LogLevel.DEBUG, "This is a debug log");
        logLogger.log(LogLevel.ERROR, "This is a error log");
    }
}
