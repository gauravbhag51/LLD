package Patterns.Creational.AbstractFactory;

public class AlphabeticObjectFactory implements IObjectFactory{
    @Override
    public IObject getObject(int x) {
        return switch (x)
        {
            case 1 -> new ObjectA();
            case 2 -> new ObjectB();
            default -> null;
        };
    }
}
