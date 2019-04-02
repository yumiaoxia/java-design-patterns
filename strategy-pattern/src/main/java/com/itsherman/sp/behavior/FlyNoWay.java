package com.itsherman.sp.behavior;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
