package com.itsherman.sp.behavior;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("《Silence》");
    }
}
