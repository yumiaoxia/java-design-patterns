package com.itsherman.tmp;

import com.itsherman.tmp.beverage.Coffee;
import com.itsherman.tmp.beverage.Tea;
import com.itsherman.tmp.beverage.TeaWithHook;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class TemplateMeethodDemo {

    public static void main(String[] args) {
        System.out.println("Making tea without hook");
        Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nMaking tea with hook");
        TeaWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

}
