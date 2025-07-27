package Patterns.Creational.AbstractFactory;

public class NumericObjectFactory implements IObjectFactory{
    @Override
    public IObject getObject(int x) {
        return switch (x)
        {
            case 1 -> new Object1();
            case 2 -> new Object2();
            default -> null;
        };
    }
}
