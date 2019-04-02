package com.itsherman.sp.state;

import com.itsherman.sp.GumballMachine;

/**
 * 没有25分钱
 * @author Sherman
 * created in 2019/4/1
 */

public class NoQuarterState implements State{
    GumballMachine gumBallMachine;

    public NoQuarterState(GumballMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You insert a quarter");
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
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
        System.out.println("You need to pay first");
    }
}
