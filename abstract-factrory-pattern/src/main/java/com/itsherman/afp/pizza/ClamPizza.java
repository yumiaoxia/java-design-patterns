package com.itsherman.afp.pizza;

import com.itsherman.afp.IntegredientFactory.PizzaIntegredientFactory;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class ClamPizza extends Pizza {
    PizzaIntegredientFactory integredientFactory;

    public ClamPizza(PizzaIntegredientFactory integredientFactory) {
        this.integredientFactory = integredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+ name);
        dough= integredientFactory.createDough();
        sauce = integredientFactory.createSauce();
        cheese = integredientFactory.createCheese();
        clames = integredientFactory.createClams();
    }
}
