package com.itsherman.tmp.beverage;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class TeaWithHook extends Tea {

    @Override
    boolean customerWantCondiments() {
        return true;
    }
}
