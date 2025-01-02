package carRentalSystem;

import java.util.List;

import carRentalSystem.product.Vehicle;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;
    public VehicleInventoryManagement(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    

}
