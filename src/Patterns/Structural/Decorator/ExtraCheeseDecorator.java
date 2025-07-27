package Patterns.Structural.Decorator;

public class ExtraCheeseDecorator extends ToppingDecorator{
    ExtraCheeseDecorator(IPizza basePizza)
    {
        super(basePizza);
    }
    public int cost(){
        return this.basePizza.cost() + 30;
    }
}
