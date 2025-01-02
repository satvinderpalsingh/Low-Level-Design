package carRentalSystem;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import carRentalSystem.product.Vehicle;
import carRentalSystem.product.VehicleStatus;
import carRentalSystem.product.VehicleType;

public class CarRentalSystemMain {
    public static void main(String[] args) {
        List<User> users=addUser();
        List<Store> stores=addStore();
        VehicleRentalSystem vehicleRentalSystem=new VehicleRentalSystem(users,stores);
        User user1=users.get(0);
        Store store1=vehicleRentalSystem.getStore();
        List<Vehicle>vehicles=store1.getAvailableVehicles();
        ReservedVehicles reservedVehicle=store1.createReservation(vehicles.get(0), user1, store1.getLocation(), store1.getLocation(),null,null,null);
        System.out.println("Reservation created with reservation id: "+reservedVehicle.reservationId);
        Bill bill=new Bill(reservedVehicle, 100.0);
        System.out.println("Bill generated with bill id: "+bill);
        Payment payment=new Payment( (double) 100,"Credit Card", "done",bill);
        System.out.println("Car Rental System");
    }
    private static List<Vehicle> addVehicle() {
        List<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(new Vehicle("1","Toyota",VehicleType.CAR,100,"1234",VehicleStatus.ACTIVE));
        vehicles.add(new Vehicle("3","Hyundai",VehicleType.CAR,100,"1234",VehicleStatus.ACTIVE));
        return vehicles;
    }
    private static List<User> addUser() {
        List<User> users=new ArrayList<>();
        users.add(new User("1","John","1234"));
        return users;
    }
    private static List<Store> addStore(){
        List<Store> stores=new ArrayList<>();
        VehicleInventoryManagement vehicleInventoryManagement=new VehicleInventoryManagement(addVehicle());
        Location location1=new Location("location1", "Jammu", "Jammu", "J&K", "181102");
        Store store1=new Store("1",vehicleInventoryManagement,location1,new ArrayList<>());
        stores.add(store1);
        return stores;
    }


}

