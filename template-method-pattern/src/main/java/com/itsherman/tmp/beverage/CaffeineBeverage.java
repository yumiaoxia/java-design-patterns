package com.itsherman.tmp.beverage;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        //把水煮沸
        boilWater();
        //用热水泡咖啡或茶
        brew();
        // 把饮料倒进杯子
        pourInCup();
        //加入适当的调料 //hook()
        if(customerWantCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();
    boolean customerWantCondiments(){
        return false;
    }
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
