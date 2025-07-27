package Patterns.Creational.Singleton;

public class DoubleLockInitialization {
    private static DoubleLockInitialization instance;
    private DoubleLockInitialization(){};

    public static DoubleLockInitialization getInstance(){
        if (instance == null)
        {
            synchronized (DoubleLockInitialization.class) {
                if (instance == null) {
                    instance = new DoubleLockInitialization();
                }
            }
        }
        return instance;
    }
}
