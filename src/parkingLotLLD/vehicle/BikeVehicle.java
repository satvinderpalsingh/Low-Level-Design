package parkingLotLLD.vehicle;

import parkingLotLLD.utils.VehicleType;

public class BikeVehicle implements Vehicle {
    private final VehicleType vehicleType;
    private final String vehicleNumber;

    public BikeVehicle(String vehicleNumber) {
        this.vehicleType = VehicleType.BIKE;
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
