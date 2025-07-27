package Patterns.Structural.Decorator;

public abstract class ToppingDecorator implements IPizza{
    protected IPizza basePizza;
    public ToppingDecorator(IPizza basePizza){
        this.basePizza = basePizza;
    }
}
