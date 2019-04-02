package com.itsherman.sfp.pizza;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List toppings = new ArrayList();
//    Veggies veggies;
//    Cheese cheese;
//    Pepperoni pepperoni;
//    Clames clames;

    public  void prepare(){
        System.out.println("Preparing " +name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   "+toppings.get(i));
        }
    };

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }

}
