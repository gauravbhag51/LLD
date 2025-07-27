package Patterns.Creational.BuilderPattern;

public class Home {
    private int roomCount;
    private int kitchenCount;
    private int hallCount;

    Home(int roomCount, int kitchenCount, int hallCount)
    {
        this.hallCount = hallCount;
        this.kitchenCount = kitchenCount;
        this.roomCount = roomCount;
    }

    public void displayName()
    {
        System.out.println(this.roomCount+"B"+this.hallCount+"H"+this.kitchenCount+"K");
    }
}
