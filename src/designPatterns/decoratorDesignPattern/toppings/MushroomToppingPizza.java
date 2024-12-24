package designPatterns.decoratorDesignPattern.toppings;

import designPatterns.decoratorDesignPattern.BasePizza;

public class MushroomToppingPizza extends ToppingDecorator {
    private BasePizza basePizza;

    public MushroomToppingPizza(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
