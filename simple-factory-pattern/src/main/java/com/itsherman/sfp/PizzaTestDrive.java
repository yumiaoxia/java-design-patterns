package com.itsherman.sfp;

import com.itsherman.sfp.factory.SimplePizzaFactory;
import com.itsherman.sfp.pizza.Pizza;
import com.itsherman.sfp.pizzastore.PizzaStore;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName());
    }
}
