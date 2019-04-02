package com.itsherman.cp.doer;

/**
 * 电灯
 *
 * @author Sherman
 * created in 2019/3/27
 */

public class Light {

    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println("Turn the "+name+" light on!");
    }

    public void off(){
        System.out.println("Turn the "+name+" light off!");
    }

    public String getName() {
        return name;
    }
}
