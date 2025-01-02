package carRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;
    VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;
    }
    //add filters here which store required 
    public Store getStore(){
        return stores.get(0);
    }
    


}
