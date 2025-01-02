package carRentalSystem;

import java.sql.Date;
import java.util.List;

import carRentalSystem.product.Vehicle;

public class Store {
    private String storeId;
    private VehicleInventoryManagement vehicleInventoryManagement;
    private Location location;
    private List<ReservedVehicles> reservedVehicles;
    public Store(String storeId, VehicleInventoryManagement vehicleInventoryManagement, Location location, List<ReservedVehicles> reservedVehicles) {
        this.storeId = storeId;
        this.vehicleInventoryManagement = vehicleInventoryManagement;
        this.location = location;
        this.reservedVehicles = reservedVehicles;
    }
    public String getStoreId() {
        return storeId;
    }
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }
    public VehicleInventoryManagement getVehicleInventoryManagement() {
        return vehicleInventoryManagement;
    }
    public void setVehicleInventoryManagement(VehicleInventoryManagement vehicleInventoryManagement) {
        this.vehicleInventoryManagement = vehicleInventoryManagement;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public List<ReservedVehicles> getReservedVehicles() {
        return reservedVehicles;
    }
    public void addReservedVehicles(ReservedVehicles reservedVehicle) {
        reservedVehicles.add(reservedVehicle);
    }
    //add filters here which type of vehicle required
    public List<Vehicle> getAvailableVehicles(){
        return vehicleInventoryManagement.vehicles;
    }
    public ReservedVehicles createReservation(Vehicle vehicle, User user, Location pickLocation, Location dropLocation, Date bookedFrom, Date bookedTill, Date bookedAt) {
        ReservedVehicles reservedVehicle = new ReservedVehicles();
        return reservedVehicle.createReservation(vehicle, user, pickLocation, dropLocation, bookedFrom, bookedTill, bookedAt, this);
    }


}
