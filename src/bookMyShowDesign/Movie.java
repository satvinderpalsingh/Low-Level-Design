package bookMyShowDesign;

public class Movie {
    private String movieId;
    private String movieName;
    private int movieDuration;
    public Movie(String movieId, String movieName, int movieDuration) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDuration = movieDuration;
    }
    public String getMovieId() {
        return movieId;
    }
    public String getMovieName() {
        return movieName;
    }
    public int getMovieDuration() {
        return movieDuration;
    }
    
}
