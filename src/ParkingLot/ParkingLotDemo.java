package ParkingLot;

import ParkingLot.Vehicle.Bike;
import ParkingLot.Vehicle.Car;
import ParkingLot.Vehicle.Truck;
import ParkingLot.Vehicle.Vehicle;

public class ParkingLotDemo {
    public static void run()
    {
        ParkingLot parkingLot = ParkingLot.getInstance();

        parkingLot.addLevel(new Level(1,10));
        parkingLot.addLevel(new Level(2, 15));

        Vehicle car = new Car("1");
        Vehicle bike = new Bike("2");
        Vehicle truck = new Truck("3");

        parkingLot.displayAvailability();

        parkingLot.park(car);
        parkingLot.park(bike);
        parkingLot.park(truck);

        parkingLot.displayAvailability();

        parkingLot.unpark(car);
        parkingLot.unpark(bike);

        parkingLot.displayAvailability();

    }
}
