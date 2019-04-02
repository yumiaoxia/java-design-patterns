package fmp.pizzastore;

import fmp.pizza.ChicagoStyleCheesePizza;
import fmp.pizza.Pizza;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        if(item.equals("cheese")){
            pizza =new  ChicagoStyleCheesePizza();
        }else if(item.equals("veggie")){
            pizza =new  ChicagoStyleCheesePizza();
        }else if(item.equals("clam")){
            pizza =new  ChicagoStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            pizza =new  ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
