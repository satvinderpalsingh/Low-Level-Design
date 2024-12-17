package DesignPatterns.StrategyDesignPattern.withPattern;

public class Vehicle{
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
    public void display(){
        System.out.println("Normal Car Display");
    }
}
