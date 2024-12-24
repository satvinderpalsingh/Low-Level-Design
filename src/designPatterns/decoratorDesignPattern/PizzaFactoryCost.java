package designPatterns.decoratorDesignPattern;

import designPatterns.decoratorDesignPattern.toppings.ExtraCheeseToppingPizza;
import designPatterns.decoratorDesignPattern.toppings.JalapenosToppingPizza;
import designPatterns.decoratorDesignPattern.toppings.MushroomToppingPizza;

public class PizzaFactoryCost {
    public static void main(String[] args) {
        BasePizza pizza=new MushroomToppingPizza(new ExtraCheeseToppingPizza(new MargheritaPizza()));
        System.out.println("Total cost of pizza: Mushroom+ExtraCheese+Margherita: "+pizza.cost());
        BasePizza pizza2=new JalapenosToppingPizza(new ExtraCheeseToppingPizza(new MargheritaPizza()));
        System.out.println("Total cost of pizza: Jalapenos+ExtraCheese+Margherita: "+pizza2.cost());
        BasePizza pizza3=new JalapenosToppingPizza(new ExtraCheeseToppingPizza(new FarmHousePizza()));
        System.out.println("Total cost of pizza: Jalapenos+ExtraCheese+FarmHouse: "+pizza3.cost());
        BasePizza pizza4=new MushroomToppingPizza(new ExtraCheeseToppingPizza(new VegDelightPizza()));
        System.out.println("Total cost of pizza: Mushroom+ExtraCheese+VegDelight: "+pizza4.cost());
    }
}
