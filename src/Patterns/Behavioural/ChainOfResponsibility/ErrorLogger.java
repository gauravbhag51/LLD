package Patterns.Behavioural.ChainOfResponsibility;

public class ErrorLogger extends Logger {
    ErrorLogger(){
        super();
    }
    ErrorLogger(Logger nextLogger){
        super(nextLogger);
    }
    public void log(LogLevel level, String message)
    {
        if(level == LogLevel.ERROR){
            System.out.println("ERROR: "+message);
        }
        else{
            super.log(level,message);
        }
    }
}
