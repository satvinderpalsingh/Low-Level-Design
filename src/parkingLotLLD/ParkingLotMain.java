package parkingLotLLD;

import java.util.ArrayList;

import parkingLotLLD.parkingLot.EntryPanel;
import parkingLotLLD.parkingLot.ExitPanel;
import parkingLotLLD.parkingLot.ParkingFloor;
import parkingLotLLD.parkingLot.ParkingLot;
import parkingLotLLD.parkingSpot.FourWheelerParkingSpot;
import parkingLotLLD.parkingSpot.HandicappedParkingSpot;
import parkingLotLLD.parkingSpot.ParkingSpot;
import parkingLotLLD.parkingSpot.TwoWheelerParkingSpot;
import parkingLotLLD.parkingTicket.ParkingTicket;
import parkingLotLLD.utils.ParkingSpotType;
import parkingLotLLD.vehicle.CarVehicle;
import parkingLotLLD.vehicle.Vehicle;

public class ParkingLotMain {
    public static void main(String[] args) {

        //Initialize the parking lot
        ArrayList<ParkingFloor> parkingFloors = new ArrayList<>();
        ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
        ArrayList<EntryPanel> entryPanels = new ArrayList<>();
        ArrayList<ExitPanel> exitPanels = new ArrayList<>();

        ParkingSpot twoWheelerParkingSpot = new TwoWheelerParkingSpot();
        ParkingSpot fourWheelerParkingSpot = new FourWheelerParkingSpot();
        ParkingSpot handicappedParkingSpot = new HandicappedParkingSpot();
        EntryPanel entryPanel = new EntryPanel("entry_panel_1_floor_1");
        ExitPanel existPanel = new ExitPanel("exit_panel_1_floor_1");
        parkingSpots.add(twoWheelerParkingSpot);
        parkingSpots.add(fourWheelerParkingSpot);
        parkingSpots.add(handicappedParkingSpot);
        entryPanels.add(entryPanel);
        exitPanels.add(existPanel);
        ParkingFloor parkingFloor = new ParkingFloor("floor_1", parkingSpots, entryPanels, 
        exitPanels, 3);
        parkingFloor.addParkingSpot(twoWheelerParkingSpot);
        parkingFloors.add(parkingFloor);
        ParkingLot parkingLot = new ParkingLot(parkingFloors);

        Vehicle hondaCity = new CarVehicle("KA-01-HH-1234");
        ParkingTicket parkingTicket=parkingLot.parkVehicle(hondaCity, ParkingSpotType.FOUR_WHEELER);
        Vehicle bmwVehicle = new CarVehicle("KA-01-HH-1235");
        parkingLot.unParkVehicle(parkingTicket, existPanel);
        parkingLot.parkVehicle(bmwVehicle, ParkingSpotType.FOUR_WHEELER);
    }

}
