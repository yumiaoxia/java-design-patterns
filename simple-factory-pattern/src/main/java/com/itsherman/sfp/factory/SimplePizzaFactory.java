package com.itsherman.sfp.factory;

import com.itsherman.sfp.pizza.NYStypeCheesePizza;
import com.itsherman.sfp.pizza.Pizza;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public class SimplePizzaFactory {

    public Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStypeCheesePizza();
        }else if(item.equals("veggie")){
            return new NYStypeCheesePizza();
        }else if(item.equals("clam")){
            return new NYStypeCheesePizza();
        }else if(item.equals("pepperoni")){
            return new NYStypeCheesePizza();
        } else {
            return null;
        }
    }
}
