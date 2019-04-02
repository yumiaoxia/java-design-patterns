package com.itsherman.sp;

import com.itsherman.sp.duck.Duck;
import com.itsherman.sp.duck.MallardDuck;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
