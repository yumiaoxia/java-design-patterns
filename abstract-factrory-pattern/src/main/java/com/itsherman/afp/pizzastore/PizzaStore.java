package com.itsherman.afp.pizzastore;

import com.itsherman.afp.pizza.Pizza;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = creeatePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza creeatePizza(String type);
}
