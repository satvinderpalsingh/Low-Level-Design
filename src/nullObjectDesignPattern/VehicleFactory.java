package nullObjectDesignPattern;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return new Null();
        }
        if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        }
        return new Null();
    }

}
