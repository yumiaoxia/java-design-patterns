package com.itsherman.ap.adater;

import com.itsherman.ap.duck.Duck;
import com.itsherman.ap.turkey.Turkey;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public  class TurkeyAdater implements Duck {
    Turkey turekey;

    public TurkeyAdater(Turkey turekey) {
        this.turekey = turekey;
    }

    @Override
    public void quack() {
        turekey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turekey.fly();
        }
    }
}
