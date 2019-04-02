package com.itsherman.dp.bevarage;

import com.itsherman.dp.bevarage.Beverage;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
