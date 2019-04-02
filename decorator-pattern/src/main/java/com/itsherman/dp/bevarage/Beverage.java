package com.itsherman.dp.bevarage;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
