package DesignPatterns.StrategyDesignPattern.withPattern;

public class SportyDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sporty Car Drive");
    }
}
