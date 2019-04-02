package com.itsherman.sp.duck;

import com.itsherman.sp.behavior.FlyBehavior;
import com.itsherman.sp.behavior.QuackBehavior;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}
    public abstract void display();
    public void performFly(){
       flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float,even decoys");
    }
}
