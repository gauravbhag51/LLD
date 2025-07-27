package Patterns.Structural.Decorator;

public class VeggiesDecorator extends ToppingDecorator{
    VeggiesDecorator(IPizza basePizza)
    {
        super(basePizza);
    }
    public int cost(){
        return this.basePizza.cost() + 50;
    }
}
