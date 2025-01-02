package carRentalSystem.product;

public class Vehicle {
    String vehicleID;
    String vehicleName;
    VehicleType vehicleType;
    double pricePerDay;
    String vehicleNumber;
    VehicleStatus vehicleStatus;
    public Vehicle(String vehicleID, String vehicleName, VehicleType vehicleType, double pricePerDay, String vehicleNumber, VehicleStatus vehicleStatus) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.pricePerDay = pricePerDay;
        this.vehicleNumber = vehicleNumber;
        this.vehicleStatus = vehicleStatus;
    }
    public String getVehicleID() {
        return vehicleID;
    }
    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }
    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

}
