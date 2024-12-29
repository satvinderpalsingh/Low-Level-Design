package parkingLotLLD.parkingSpot;

import parkingLotLLD.utils.ParkingSpotType;

public class FourWheelerParkingSpot implements ParkingSpot {
    private boolean isSpotAvailable;
    private final ParkingSpotType parkingSpotType;
    private final int spotPrice;

    public FourWheelerParkingSpot() {
        this.isSpotAvailable = true;
        this.parkingSpotType = ParkingSpotType.FOUR_WHEELER;
        this.spotPrice = 50;
    }

    @Override
    public boolean isSpotAvailable() {
        return isSpotAvailable;
    }

    @Override
    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    @Override
    public int getSpotPrice() {
        return spotPrice;
    }
    @Override
    public void setSpotAvailability(boolean isSpotAvailable) {
        this.isSpotAvailable = isSpotAvailable;
    }

}
