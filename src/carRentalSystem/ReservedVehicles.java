package carRentalSystem;

import java.util.Date;

import carRentalSystem.product.Vehicle;

public class ReservedVehicles {
    String reservationId;
    Vehicle vehicle;
    User user;
    Location pickLocation;
    Location dropLocation;
    Date bookedFrom;
    Date bookedTill;
    Date bookedAt;
    public ReservedVehicles createReservation(Vehicle vehicle, User user, Location pickLocation, Location dropLocation, Date bookedFrom, Date bookedTill, Date bookedA,Store store) {
        // logic to create reservation
        ReservedVehicles reservedVehicle = new ReservedVehicles();
        reservedVehicle.vehicle = vehicle;
        reservedVehicle.user = user;
        reservedVehicle.pickLocation = pickLocation;
        reservedVehicle.dropLocation = dropLocation;
        reservedVehicle.bookedFrom = bookedFrom;
        reservedVehicle.bookedTill = bookedTill;
        reservedVehicle.bookedAt = bookedAt;
        store.addReservedVehicles(reservedVehicle);
        return reservedVehicle;


    }   


}
