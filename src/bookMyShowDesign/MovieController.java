package bookMyShowDesign;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieController {
    private Map<Address,List<Movie>> cityVMovies;
    public void addMovie(Movie movie, Address address) {
        if(cityVMovies.containsKey(address)) {
            cityVMovies.get(address).add(movie);
        } else {
            cityVMovies.put(address, List.of(movie));
        }
    }
    public List<Movie> getMovies(Address address) {
        return cityVMovies.get(address);
    }
    public void removeMovie(Movie movie, Address address) {
        if(cityVMovies.containsKey(address)) {
            cityVMovies.get(address).remove(movie);
        }
    }
    public List<Address> getListOfCity(){
        List<Address> addresses=new ArrayList<>(this.cityVMovies.keySet());
        return addresses;
    }
    
    
}
