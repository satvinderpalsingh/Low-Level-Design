package designPatterns.strategyDesignPattern.withPattern;


public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle(new SportyDrive());
        vehicle.drive();
        vehicle.display();
        vehicle = new OffRoadVehicle(new SportyDrive());
        vehicle.drive();
        vehicle.display();
    }
}
