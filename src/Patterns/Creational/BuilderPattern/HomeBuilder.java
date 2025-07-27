package Patterns.Creational.BuilderPattern;

public class HomeBuilder {
    private int roomCount;
    private int kitchenCount;
    private int hallCount;
    public HomeBuilder()
    {
        this.roomCount = 0;
        this.hallCount = 0;
        this.kitchenCount = 0;
    }

    public HomeBuilder addRoomCount(int roomCount)
    {
        this.roomCount = roomCount;
        return this;
    }
    public HomeBuilder addHallCount(int hallCount)
    {
        this.hallCount = hallCount;
        return this;
    }
    public HomeBuilder addKitchenCount(int kitchenCount)
    {
        this.kitchenCount = kitchenCount;
        return this;
    }

    public Home build()
    {
        return new Home(this.roomCount, this.kitchenCount, this.hallCount);
    }
}
