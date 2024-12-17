package DesignPatterns.StrategyDesignPattern.withPattern;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
