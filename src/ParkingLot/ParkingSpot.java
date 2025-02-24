package ParkingLot;

import ParkingLot.Vehicle.Vehicle;
import ParkingLot.Vehicle.VehicleType;

public class ParkingSpot {
    private final int spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    ParkingSpot(int spotNumber, VehicleType vehicleType)
    {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public boolean isAvailable(){
        return parkedVehicle == null;
    }
    public int getSpotNumber()
    {
        return this.spotNumber;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void park(Vehicle vehicle)
    {
        if(isAvailable() && vehicle.getType() == vehicleType)
        {
            parkedVehicle = vehicle;
        }
        else
        {
            throw new IllegalArgumentException("Invalid vehicle type or spot already occupied");
        }
    }
    public void unpark()
    {
        parkedVehicle = null;
    }


}
