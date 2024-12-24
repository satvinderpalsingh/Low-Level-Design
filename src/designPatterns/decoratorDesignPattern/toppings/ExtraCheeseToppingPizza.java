package designPatterns.decoratorDesignPattern.toppings;

import designPatterns.decoratorDesignPattern.BasePizza;
//Both has-a relationship and is-a relationship are present in the code.
//has-a relationship is present because ExtraCheeseToppingPizza has a BasePizza.
//is-a relationship is present because ExtraCheeseToppingPizza is a ToppingDecorator.
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
