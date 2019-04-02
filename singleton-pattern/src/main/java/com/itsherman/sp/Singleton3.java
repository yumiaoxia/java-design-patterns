package com.itsherman.sp;

/**
 * 饿汉式
 * @author Sherman
 * created in 2019/3/27
 */

public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return singleton3;
    }
}
