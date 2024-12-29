package parkingLotLLD.parkingLot;

import java.util.List;

import parkingLotLLD.parkingSpot.ParkingSpot;
import parkingLotLLD.parkingTicket.ParkingTicket;
import parkingLotLLD.utils.ParkingSpotType;
import parkingLotLLD.vehicle.Vehicle;

public class ParkingLot {
    private final List<ParkingFloor> floors;


    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public boolean addFloor(ParkingFloor floor) {
        floors.add(floor);
        return true;
    }

    public ParkingFloor isParkingSpaceAvailable(ParkingSpotType parkingSpotType) {
        for (ParkingFloor floor : floors) {
            ParkingSpot spot = floor.checkAvaiableSpot(parkingSpotType);
            if (spot!=null) {
                return floor;
            }
        }
        return null;
    }
    public ParkingTicket parkVehicle(Vehicle vehicle, 
            ParkingSpotType parkingSpotType) {
        ParkingFloor floor = isParkingSpaceAvailable(parkingSpotType);
        if (floor == null) {
            System.out.println("Parking is full");
            return null;
            
        }
        ParkingSpot parkingSpot=floor.checkAvaiableSpot(parkingSpotType);
        parkingSpot.setSpotAvailability(false);
        ParkingTicket parkingTicket=floor.getEntryPanel().get(0).getParkingTicket(vehicle, System.currentTimeMillis(), "ticketId-1",parkingSpot);
        System.out.println("Vehicle with vehicle number "+vehicle.getVehicleNumber()+" is parked at floor "+floor.getFloorId()+" with ticket "+parkingTicket.getTicketId());
        return parkingTicket;
    }
    public void unParkVehicle(ParkingTicket parkingTicket,ExitPanel exitPanel){
        exitPanel.updateParkingTicket(parkingTicket, System.currentTimeMillis(), parkingTicket.getParkingSpot());
        exitPanel.updateParkingSpot(parkingTicket.getParkingSpot());
        exitPanel.collectPayment(parkingTicket);
    }


}
