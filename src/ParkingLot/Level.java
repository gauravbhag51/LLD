package ParkingLot;

import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final int floor;
    private final List<ParkingSpot> parkingSpots;

    Level(int floor, int spots)
    {
        ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
        for(int i=0;i<spots;i++)
        {
            parkingSpots.add(new ParkingSpot(i, VehicleType.values()[i%3]));
        }
        this.parkingSpots = parkingSpots;
        this.floor = floor;
    }

    public int getFloor()
    {
        return floor;
    }

    public boolean park(Vehicle vehicle)
    {
        for(ParkingSpot spot: parkingSpots)
        {
            if(spot.isAvailable() && spot.getVehicleType() == vehicle.getType())
            {
                spot.park(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unpark(Vehicle vehicle)
    {
        for(ParkingSpot spot: parkingSpots)
        {
            if(spot.getParkedVehicle() == vehicle)
            {
                spot.unpark();
                return true;
            }
        }
        return false;
    }

    public void displayAvailability()
    {
        System.out.println("Floor: "+floor+" Availability:");

        for(ParkingSpot spot: parkingSpots)
        {
            System.out.println("Spot " + spot.getSpotNumber() + (spot.isAvailable() ? " Available for: " + spot.getVehicleType(): " Reserved for: "+ spot.getParkedVehicle().getType() + " with license number " + spot.getParkedVehicle().getLicense()));
        }
    }
}
