package parkingLotLLD.parkingLot;

import parkingLotLLD.parkingSpot.ParkingSpot;
import parkingLotLLD.parkingTicket.ParkingTicket;

public class ExitPanel {
    private final String exitPanelId;

    public ExitPanel(String exitPanelId) {
        this.exitPanelId = exitPanelId;
    }

    public String getExitPanelId() {
        return exitPanelId;
    }
    public void updateParkingTicket(ParkingTicket ticket, long outTime, ParkingSpot spot) {
        ticket.setOutTime(outTime);
        ticket.setPrice(calculatePrice(ticket.getInTime(), outTime,spot.getSpotPrice()));
        ticket.setExitPanelId(this.exitPanelId);
    }
    public void updateParkingSpot(ParkingSpot spot) {
        spot.setSpotAvailability(true);
        
    }
    private double calculatePrice(long inTime, long outTime, int spotPrice) {
        // calculate the price based on inTime and outTime
        return (outTime - inTime)*spotPrice;
    }
    public void collectPayment(ParkingTicket ticket) {
        System.out.println("Collect the payment of: " + ticket.getPrice());
    }

}
