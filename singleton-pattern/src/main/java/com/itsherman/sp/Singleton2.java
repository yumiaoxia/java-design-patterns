package com.itsherman.sp;

/**
 * 懒汉式基础上方法加锁
 * @author Sherman
 * created in 2019/3/27
 */

public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
