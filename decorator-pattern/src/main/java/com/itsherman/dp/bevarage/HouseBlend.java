package com.itsherman.dp.bevarage;

import com.itsherman.dp.bevarage.Beverage;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return .89;
    }


}
