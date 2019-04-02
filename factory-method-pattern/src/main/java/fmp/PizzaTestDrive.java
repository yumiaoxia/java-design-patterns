package fmp;

import fmp.pizza.Pizza;
import fmp.pizzastore.NYPizzaStore;
import fmp.pizzastore.PizzaStore;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a "+pizza.getName());
    }
}
