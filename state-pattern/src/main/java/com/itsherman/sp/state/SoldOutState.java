package com.itsherman.sp.state;

import com.itsherman.sp.GumballMachine;

/**
 * 售罄状态
 * @author Sherman
 * created in 2019/4/1
 */

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You Can't insert a quarter,No gumball sold");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned,but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball sold");
    }
}
