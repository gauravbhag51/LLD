import Patterns.Creational.AbstractFactory.IObjectFactory;
import Patterns.Creational.AbstractFactory.NumericObjectFactory;
import Patterns.Creational.AbstractFactory.ObjectAbstractFactory;
import Patterns.Creational.BuilderPattern.Home;
import Patterns.Creational.BuilderPattern.HomeBuilder;
import Patterns.Creational.Factory.ObjectFactory;
import Patterns.Creational.Prototype.Answer;
import Patterns.Creational.Prototype.IPrototype;
import Patterns.Creational.Singleton.LazyInitialization;

public class Main {
    public static void main(String[] args) {
//        ParkingLotDemo.run();
//        VendingMachineDemo.run();
        LazyInitialization singleton = LazyInitialization.getInstance();
        ObjectFactory factory = new ObjectFactory();
        factory.getObject(1).display();

        ObjectAbstractFactory abstractFactory = new ObjectAbstractFactory();
        IObjectFactory numericObjectFactory = abstractFactory.getObjectFactory(true);
        IObjectFactory alphabeticalObjectFactory = abstractFactory.getObjectFactory(false);

        numericObjectFactory.getObject(1).display();
        alphabeticalObjectFactory.getObject(1).display();
        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.addHallCount(2).addKitchenCount(1).addRoomCount(3);
        Home home = homeBuilder.build();
        home.displayName();

        Answer ans1 = new Answer("This is answer1");
        Answer ans2 = (Answer) ans1.clone();
        ans1.showAnswer();
        ans2.showAnswer();
    }
}