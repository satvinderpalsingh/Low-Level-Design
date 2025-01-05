package bookMyShowDesign;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {
    private MovieController movieController;
    private TheatreController theatreController;
    BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }
    private List<Address> addCities() {
        List<Address> cities= new ArrayList<>();
        cities.add(new Address("address_1","HSR-layout", "Banglore"));
        cities.add(new Address("address_2","Kormangala", "Banglore"));
        cities.add(new Address("address_3","Indira Nagar", "Banglore"));
        return cities;

    }
    private List<Movie> addMovies(){
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("movie_1", "AVENGER", 100));
        movies.add(new Movie("movie_2", "BAHUBALI", 100));
        movies.add(new Movie("movie_3", "SALAAR", 100));
        return movies;


    }
    private List<Seat> addSeats() {
        List<Seat> seats = new ArrayList<>();
        seats.add(new Seat("seat_1", "seat_1","GOLD",100));
        seats.add(new Seat("seat_2", "seat_2","SILVER",100));
        seats.add(new Seat("seat_3", "seat_3","BRONZE",100));
        return seats;
    }
    private List<Screen> addScreens() {
        List<Screen> screens = new ArrayList<>();
        List<Seat> seats = addSeats();
        screens.add(new Screen("screen_1", seats, 100));
        screens.add(new Screen("screen_2", seats, 100));
        screens.add(new Screen("screen_3", seats, 100));
        return screens;
    }
    private List<Show> addShows() {
        List<Show> shows = new ArrayList<>();
        List<Movie> movies = addMovies();
        List<Screen> screens = addScreens();
        shows.add(new Show("show_1", movies.get(0), screens.get(0), 100L, new ArrayList<>()));
        shows.add(new Show("show_2", movies.get(1), screens.get(1), 100L, new ArrayList<>()));
        shows.add(new Show("show_3", movies.get(2), screens.get(2), 100L, new ArrayList<>()));
        return shows;
    }
    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();


        
        



    }
    private void createMovies(Address address1,Address address2){
        //movie AVENGER
        Movie movie1= new Movie("movie_1", "AVENGER", 100);

        //movie BAHUBALI
        Movie movie2=new Movie("movie_2","BAHUBALI",100);

        movieController.addMovie(movie2, address2);
        movieController.addMovie(movie1, address1);
        
    }
    private void createTheatres(){
        List<Address> address=movieController.getListOfCity();
        
        //Threatre 1
        Theatre theatre1= new Theatre("theatre_1");
        
        




    }
    public void initialize() {
    
    }
    
}
