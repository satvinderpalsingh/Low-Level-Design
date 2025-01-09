package adapterDesignPattern.adapter;

import adapterDesignPattern.adaptee.WeightInPounds;

public class WeightingMachineInKgs implements WeightInKgs {
    WeightInPounds weightInPounds;
    public WeightingMachineInKgs(WeightInPounds weightInPounds) {
        this.weightInPounds = weightInPounds;
    }

    @Override
    public double getWeightInKgs() {
        return weightInPounds.getWeightInPounds() *0.45359237;
    }

}
