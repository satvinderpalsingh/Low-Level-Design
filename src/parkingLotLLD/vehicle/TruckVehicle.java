package parkingLotLLD.vehicle;

import parkingLotLLD.utils.VehicleType;

public class TruckVehicle implements Vehicle {
    private final VehicleType vehicleType;
    private final String vehicleNumber;

    public TruckVehicle(String vehicleNumber) {
        this.vehicleType = VehicleType.TRUCK;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String getVehicleNumber() {
        return vehicleNumber;
    }

}
