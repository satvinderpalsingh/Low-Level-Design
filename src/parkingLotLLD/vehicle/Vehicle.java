package parkingLotLLD.vehicle;

import parkingLotLLD.utils.VehicleType;


public interface Vehicle {
    VehicleType getVehicleType();
    String getVehicleNumber();
}