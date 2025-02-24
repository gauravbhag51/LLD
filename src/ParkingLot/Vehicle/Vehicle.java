package ParkingLot.Vehicle;

public class Vehicle {
    private VehicleType type;
    private String license;

    Vehicle(String license, VehicleType type)
    {
        this.license = license;
        this.type = type;
    }
    public VehicleType getType()
    {
        return type;
    }
    public String getLicense()
    {
        return license;
    }
}
