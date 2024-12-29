package parkingLotLLD.parkingLot;

import parkingLotLLD.parkingSpot.ParkingSpot;
import parkingLotLLD.parkingTicket.ParkingTicket;
import parkingLotLLD.vehicle.Vehicle;

public class EntryPanel {
    private final String entryPanelId;

    public EntryPanel(String entryPanelId) {
        this.entryPanelId = entryPanelId;
    }
    public String getEntryPanelId() {
        return entryPanelId;
    }
    public ParkingTicket getParkingTicket(Vehicle vehicle, long inTime,String ticketId, ParkingSpot parkingSpot) {
        return new ParkingTicket(ticketId,vehicle, inTime,this.entryPanelId,parkingSpot);
    }
}
