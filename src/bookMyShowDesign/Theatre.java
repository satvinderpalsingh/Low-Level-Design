package bookMyShowDesign;

import java.util.List;

public class Theatre {
    private String theatreId;
    private Address address;
    private List<Screen> screens;
    private List<Show> shows;
    public Theatre(String theatreId){
        this.theatreId = theatreId;
    }
    public String getTheatreId() {
        return theatreId;
    }  
    public Address getAddress() {
        return address;
    }
    public List<Screen> getScreens() {
        return screens;
    }
    public List<Show> getShows() {
        return shows;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }
    public void setShows(List<Show> shows) {
        this.shows = shows;
    }
    
    
}
