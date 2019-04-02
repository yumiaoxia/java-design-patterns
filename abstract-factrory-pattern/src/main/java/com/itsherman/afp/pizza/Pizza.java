package com.itsherman.afp.pizza;

import com.itsherman.afp.meterial.*;

/**
 * @author Sherman
 * created in 2019/3/26
 */

public abstract  class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clames clames;

    public abstract void prepare();

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