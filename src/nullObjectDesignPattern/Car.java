package nullObjectDesignPattern;

public class Car implements Vehicle {
    @Override
    public int totalWheels() {
        return 4;
    }

    @Override
    public int totalSeats() {
        return 4;
    }

}
