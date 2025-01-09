package adapterDesignPattern;

import adapterDesignPattern.adaptee.BabiesWeightMachine;
import adapterDesignPattern.adaptee.WeightInPounds;
import adapterDesignPattern.adapter.WeightInKgs;
import adapterDesignPattern.adapter.WeightingMachineInKgs;

public class Main {
    public static void main(String[] args) {
       WeightInKgs weightInKgs = new WeightingMachineInKgs(new BabiesWeightMachine());
       System.out.println(weightInKgs.getWeightInKgs());
    }
}
