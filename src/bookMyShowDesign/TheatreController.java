package bookMyShowDesign;

import java.util.List;
import java.util.Map;

public class TheatreController {
    private Map<Address, List<Theatre>> cityVTheatres;
    public void addTheatre(Theatre theatre, Address address) {
        if(cityVTheatres.containsKey(address)) {
            cityVTheatres.get(address).add(theatre);
        } else {
            cityVTheatres.put(address, List.of(theatre));
        }
    }
    public List<Theatre> getTheatres(Address address) {
        return cityVTheatres.get(address);
    }
    public void removeTheatre(Theatre theatre, Address address) {
        if(cityVTheatres.containsKey(address)) {
            cityVTheatres.get(address).remove(theatre);
        }
    }
    
}
