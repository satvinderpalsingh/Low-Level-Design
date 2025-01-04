package nullObjectDesignPattern;

public class MainNullObject {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("car");
        System.out.println("Car has " + car.totalWheels() + " wheels and " + car.totalSeats() + " seats.");
        Vehicle nullVehicle = vehicleFactory.getVehicle("bike");
        System.out.println("Null vehicle has " + nullVehicle.totalWheels() + " wheels and " + nullVehicle.totalSeats() + " seats.");
    }

}
