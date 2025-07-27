package Patterns.Behavioural.ChainOfResponsibility;

public class LogLogger extends Logger {
    LogLogger(){
        super();
    }
    LogLogger(Logger nextLogger){
        super(nextLogger);
    }
    public void log(LogLevel level, String message)
    {
        if(level == LogLevel.LOG){
            System.out.println("LOG: "+message);
        }
        else{
            super.log(level,message);
        }
    }
}
