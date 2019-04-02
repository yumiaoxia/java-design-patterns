package com.itsherman.ap;

import com.itsherman.ap.adater.TurkeyAdater;
import com.itsherman.ap.duck.Duck;
import com.itsherman.ap.duck.MallarDuck;
import com.itsherman.ap.turkey.WildTurkey;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class DuckTestDrive {

    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turKeyAdater = new TurkeyAdater(turkey);

        System.out.println("The Turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ...");
        testDuck(duck);

        System.out.println("\n The TurkeyAdapter says ...");
        testDuck(turKeyAdater);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
