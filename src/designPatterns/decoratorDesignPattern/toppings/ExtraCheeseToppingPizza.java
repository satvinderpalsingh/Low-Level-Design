package designPatterns.decoratorDesignPattern.toppings;

import designPatterns.decoratorDesignPattern.BasePizza;

public class ExtraCheeseToppingPizza extends ToppingDecorator {
    private BasePizza basePizza;

    public ExtraCheeseToppingPizza(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
