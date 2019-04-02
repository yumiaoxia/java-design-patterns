package com.itsherman.sp.state;

/**
 * @author Sherman
 * created in 2019/4/1
 */

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
