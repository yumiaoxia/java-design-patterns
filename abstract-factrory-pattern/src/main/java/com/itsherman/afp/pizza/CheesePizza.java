package com.itsherman.afp.pizza;

import com.itsherman.afp.IntegredientFactory.PizzaIntegredientFactory;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class CheesePizza extends Pizza {

    PizzaIntegredientFactory integredientFactory;

    public CheesePizza(PizzaIntegredientFactory pizzaIntegredientFactory) {
        this.integredientFactory = pizzaIntegredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+name);
        dough = integredientFactory.createDough();
        sauce = integredientFactory.createSauce();
        cheese = integredientFactory.createCheese();
    }
}
