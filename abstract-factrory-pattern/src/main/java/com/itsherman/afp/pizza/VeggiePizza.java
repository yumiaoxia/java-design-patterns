package com.itsherman.afp.pizza;

import com.itsherman.afp.IntegredientFactory.PizzaIntegredientFactory;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class VeggiePizza extends Pizza{
    PizzaIntegredientFactory integredientFactory;

    public VeggiePizza(PizzaIntegredientFactory integredientFactory) {
        this.integredientFactory = integredientFactory;
    }


    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
    }
}
