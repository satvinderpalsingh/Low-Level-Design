package DesignPatterns.StrategyDesignPattern.withoutPattern;

public class SportyVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Sporty Car Drive"); //same functionality for OffRoadVehicle
    }
    @Override
    public void display(){
        System.out.println("Sporty Car Display");
    }
}
