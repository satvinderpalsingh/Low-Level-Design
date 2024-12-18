package designPatterns.strategyDesignPattern.withPattern;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Car Drive");
    }
}
