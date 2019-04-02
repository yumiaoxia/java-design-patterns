package com.itsherman.sfp.pizzastore;

import com.itsherman.sfp.factory.SimplePizzaFactory;
import com.itsherman.sfp.pizza.Pizza;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
