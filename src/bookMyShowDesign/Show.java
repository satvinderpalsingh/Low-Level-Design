package bookMyShowDesign;

import java.util.List;

public class Show {
    private String showId;
    private Movie movie;
    private Screen screen;
    private Long startTime;
    List<String> bookedSeatsId;
    public Show(String showId, Movie movie, Screen screen, Long startTime, List<String> bookedSeatsId) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.bookedSeatsId = bookedSeatsId;
    }
    public String getShowId() {
        return showId;
    }
    public Movie getMovie() {
        return movie;
    }
    public Screen getScreen() {
        return screen;
    }
    public Long getStartTime() {
        return startTime;
    }
    public List<String> getBookedSeatsId() {
        return bookedSeatsId;
    }
    
}
