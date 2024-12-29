package parkingLotLLD.parkingLot;

import java.util.List;

import parkingLotLLD.parkingSpot.ParkingSpot;
import parkingLotLLD.utils.ParkingSpotType;

public class ParkingFloor {
    private final String floorId;
    private final List<ParkingSpot> parkingSpots;
    private int totalParkingSpots;
    private final List<EntryPanel> entryPanel;
    private final List<ExitPanel> exitPanel;

    public ParkingFloor(String floorId, List<ParkingSpot> parkingSpots,
     List<EntryPanel> entryPanel, List<ExitPanel> exitPanel, int totalParkingSpots) {
        this.floorId = floorId;
        this.parkingSpots = parkingSpots;
        this.entryPanel = entryPanel;
        this.exitPanel = exitPanel;
        this.totalParkingSpots = totalParkingSpots;
    }

    public String getFloorId() {
        return floorId;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
    public List<EntryPanel> getEntryPanel() {
        return entryPanel;
    }
    public List<ExitPanel> getExitPanel() {
        return exitPanel;
    }
    public int getTotalParkingSpots() {
        return totalParkingSpots;
    }
    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
        this.totalParkingSpots++;
    }
    public void removeParkingSpot(ParkingSpot spot) {
        if (!spot.isSpotAvailable()) {
            System.out.println("Parking spot is acquired by a vehicle, cannot remove it now");
            return;
        }
        parkingSpots.remove(spot);
        this.totalParkingSpots--;
    }
    public ParkingSpot checkAvaiableSpot(ParkingSpotType parkingSpotType) {
        for (ParkingSpot spot : parkingSpots) {
        
            if (spot.getParkingSpotType() == parkingSpotType && spot.isSpotAvailable()) {
                return spot;
            }
        }
        return null;
    }


}
