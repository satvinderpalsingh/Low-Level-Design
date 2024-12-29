package parkingLotLLD.parkingTicket;

import parkingLotLLD.parkingSpot.ParkingSpot;
import parkingLotLLD.vehicle.Vehicle;

public class ParkingTicket {
    private String ticketId;
    private Vehicle vehicle;
    private long inTime;
    private long outTime;
    private double price;
    private String entryPanelId;
    private String exitPanelId;
    private ParkingSpot parkingSpot;

    public ParkingTicket(String ticketId, Vehicle vehicle, long inTime,String entryPanelId,ParkingSpot parkingSpot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.inTime = inTime;
        this.entryPanelId = entryPanelId;
        this.parkingSpot=parkingSpot;
    }
    public String getTicketId() {
        return ticketId;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public long getInTime() {
        return inTime;
    }
    public long getOutTime() {
        return outTime;
    }
    public void setOutTime(long outTime) {
        this.outTime = outTime;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getEntryPanelId() {
        return entryPanelId;
    }
    public String getExitPanelId() {
        return exitPanelId;
    }
    public void setExitPanelId(String exitPanelId) {
        this.exitPanelId = exitPanelId;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
