package com.itsherman.sp.behavior;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
