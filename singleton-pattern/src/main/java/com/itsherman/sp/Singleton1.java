package com.itsherman.sp;

/**
 * 懒汉式
 * @author Sherman
 * created in 2019/3/27
 */

public class Singleton1 {

    private static Singleton1 singleton1;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
