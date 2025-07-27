package Patterns.Creational.AbstractFactory;

public class ObjectAbstractFactory {
    public IObjectFactory getObjectFactory(boolean isNumeric)
    {
        if(isNumeric){
            return new NumericObjectFactory();
        }
        return new AlphabeticObjectFactory();
    }
}
