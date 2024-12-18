package designPatterns.strategyDesignPattern.withPattern;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
