package Patterns.Structural.Decorator;

public class Main {
    public static void main(String[] args){
        IPizza margherita = new ExtraCheeseDecorator(new MargheritaPizza());
        IPizza peppyPaneer = new VeggiesDecorator(new PeppyPaneerPizza());

        System.out.println("Margherita Pizza cost: "+ margherita.cost());
        System.out.println("Peppy Paneer Pizza cost: "+ peppyPaneer.cost());
    }
}
