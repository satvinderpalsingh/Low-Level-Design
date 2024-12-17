package DesignPatterns.StrategyDesignPattern.withPattern;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Car Drive");
    }
}
