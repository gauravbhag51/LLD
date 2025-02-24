package ParkingLot;

import ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private final List<Level> levels;
    ParkingLot()
    {
        this.levels = new ArrayList<>();
    }
    public static ParkingLot getInstance()
    {
        if(instance == null)
        {
            instance = new ParkingLot();
        }
        return instance;
    }
    public void addLevel(Level level)
    {
        levels.add(level);
    }

    public boolean park(Vehicle vehicle)
    {
        for(Level level: levels)
        {
            if(level.park(vehicle))
            {
                System.out.println("Vehicle Parked Successfully");
                return true;
            }
        }
        System.out.println("Couldn't park vehicle. Please try again later");
        return false;
    }

    public boolean unpark(Vehicle vehicle)
    {
        for(Level level: levels)
        {
            if(level.unpark(vehicle))
            {
                return true;
            }
        }
        return false;
    }

    public void displayAvailability()
    {
        for(Level level: levels)
            level.displayAvailability();
    }
}
