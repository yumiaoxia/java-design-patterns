package com.itsherman.ap.turkey;

/**
 *
 * @author Sherman
 * created in 2019/3/27
 */

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }

}
