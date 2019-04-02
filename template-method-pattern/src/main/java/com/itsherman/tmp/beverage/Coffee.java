package com.itsherman.tmp.beverage;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
