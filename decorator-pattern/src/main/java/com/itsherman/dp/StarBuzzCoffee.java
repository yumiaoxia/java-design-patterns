package com.itsherman.dp;

import com.itsherman.dp.bevarage.Beverage;
import com.itsherman.dp.bevarage.Espresso;
import com.itsherman.dp.bevarage.HouseBlend;
import com.itsherman.dp.decorator.Mocha;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
    }
}
