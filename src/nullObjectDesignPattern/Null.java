package nullObjectDesignPattern;

public class Null implements Vehicle {
    @Override
    public int totalWheels() {
        return 0;
    }

    @Override
    public int totalSeats() {
        return 0;
    }

}
