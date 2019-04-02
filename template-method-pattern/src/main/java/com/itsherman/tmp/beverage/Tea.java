package com.itsherman.tmp.beverage;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
