package bookMyShowDesign;

import java.util.List;

public class Screen {
    private String screenId;
    List<Seat> seats;
    private int totalSeats;
    public Screen(String screenId, List<Seat> seats, int totalSeats) {
        this.screenId = screenId;
        this.seats = seats;
        this.totalSeats = totalSeats;
    }
    public String getScreenId() {
        return screenId;
    }
    public List<Seat> getSeats() {
        return seats;
    }
    public int getTotalSeats() {
        return totalSeats;
    }
    
    
}
