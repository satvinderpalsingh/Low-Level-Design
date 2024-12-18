package designPatterns.strategyDesignPattern.withoutPattern;

public class OffRoadVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Sporty Car Drive"); //same functionality for SportyVehicle
    }
    @Override
    public void display(){
        System.out.println("Off Road Car Display");
    }
}
