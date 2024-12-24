package designPatterns.decoratorDesignPattern.toppings;

import designPatterns.decoratorDesignPattern.BasePizza;

public class JalapenosToppingPizza extends ToppingDecorator {
    private BasePizza basePizza;

    public JalapenosToppingPizza(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 40;
    }
}
