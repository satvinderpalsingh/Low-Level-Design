package DesignPatterns.StrategyDesignPattern.withoutPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportyVehicle();
        vehicle.drive();
        vehicle.display();
        vehicle = new OffRoadVehicle();
        vehicle.drive();
        vehicle.display();
    }
}
