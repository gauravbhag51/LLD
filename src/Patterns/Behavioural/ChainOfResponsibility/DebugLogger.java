package Patterns.Behavioural.ChainOfResponsibility;

public class DebugLogger extends Logger {
    DebugLogger(){
        super();
    }
    DebugLogger(Logger nextLogger){
        super(nextLogger);
    }
    public void log(LogLevel level, String message)
    {
        if(level == LogLevel.DEBUG){
            System.out.println("DEBUG: "+message);
        }
        else{
            super.log(level,message);
        }
    }
}
