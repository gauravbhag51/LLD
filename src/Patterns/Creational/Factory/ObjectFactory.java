package Patterns.Creational.Factory;

public class ObjectFactory {
    public IObject getObject(int x)
    {
        return switch (x) {
            case 1 -> new Object1();
            case 2 -> new Object2();
            default -> null;
        };
    }
}
