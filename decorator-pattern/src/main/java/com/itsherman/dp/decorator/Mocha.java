package com.itsherman.dp.decorator;

import com.itsherman.dp.bevarage.Beverage;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription()+" , Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
