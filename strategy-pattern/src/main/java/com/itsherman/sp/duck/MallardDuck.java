package com.itsherman.sp.duck;

import com.itsherman.sp.behavior.FlyWithWings;
import com.itsherman.sp.behavior.Quack;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
