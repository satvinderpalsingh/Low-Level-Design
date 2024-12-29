package parkingLotLLD.parkingSpot;

import parkingLotLLD.utils.ParkingSpotType;

public interface ParkingSpot {
    boolean isSpotAvailable();
    ParkingSpotType getParkingSpotType();
    int getSpotPrice();
    void setSpotAvailability(boolean isSpotAvailable);
}
