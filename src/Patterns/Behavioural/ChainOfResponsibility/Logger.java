package Patterns.Behavioural.ChainOfResponsibility;

public abstract class Logger {
     private final Logger next;
     Logger(){
         this.next = null;
     }
     Logger(Logger nextLogger){
         this.next = nextLogger;
     }
     void log(LogLevel level, String message){
         if(next != null)
         {
             next.log(level,message);
         }
     }
}
