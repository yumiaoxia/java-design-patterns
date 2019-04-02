package com.itsherman.cp.domain;

import com.itsherman.cp.domain.MenuComponent;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vagetarians;
    double price;

    public MenuItem(String name, String description, boolean vagetarians, double price) {
        this.name = name;
        this.description = description;
        this.vagetarians = vagetarians;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public boolean isVagetarians() {
        return vagetarians;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print(){
        System.out.print("   "+getName());
        if(isVagetarians()){
            System.out.print("(V)");
        }
        System.out.print(","+getPrice());
        System.out.println("        ------"+getDescription());
    }
}
