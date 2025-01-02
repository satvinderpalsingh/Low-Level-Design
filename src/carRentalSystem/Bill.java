package carRentalSystem;

public class Bill {
    ReservedVehicles reservedVehicles;
    Double totalAmount;
    public Bill(ReservedVehicles reservedVehicles, Double totalAmount) {
        this.reservedVehicles = reservedVehicles;
        this.totalAmount = totalAmount;
    }

}
