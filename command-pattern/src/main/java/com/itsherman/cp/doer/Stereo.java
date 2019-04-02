package com.itsherman.cp.doer;

/**
 * 音响
 * @author Sherman
 * created in 2019/3/27
 */

public class Stereo {
    public void on(){
        System.out.println("Turn the stereo on!");
    }

    public void setCD(){
        System.out.println("play CD");
    }

    public void setVolume(int volume){
        System.out.println("Set the volume of stereo at "+volume);
    }

    public void off(){
        System.out.println("Turn the stereo off");
    }
}
