package com.itsherman.ap.duck;

/**
 * 绿头鸭
 * @author Sherman
 * created in 2019/3/27
 */

public class MallarDuck implements Duck {


    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
