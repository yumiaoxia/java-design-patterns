package com.itsherman.afp.pizzastore;

import com.itsherman.afp.IntegredientFactory.NYPizzaIngredientFactory;
import com.itsherman.afp.IntegredientFactory.PizzaIntegredientFactory;
import com.itsherman.afp.pizza.*;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza creeatePizza(String item) {
        Pizza pizza = null;
        PizzaIntegredientFactory integredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
           pizza = new CheesePizza(integredientFactory);
           pizza.setName("New York Style Veggie Pizza");
        }else if(item.equals("veggie")){
            pizza = new VeggiePizza(integredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else if(item.equals("clam")){
            pizza = new ClamPizza(integredientFactory);
            pizza.setName("New York Style Clams Pizza");
        }else if(item.equals("pepperino")){
            pizza = new PepperoniPizza(integredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
    return pizza;
    }
}
