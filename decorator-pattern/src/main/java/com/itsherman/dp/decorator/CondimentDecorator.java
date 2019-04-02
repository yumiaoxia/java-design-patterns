package com.itsherman.dp.decorator;

import com.itsherman.dp.bevarage.Beverage;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
