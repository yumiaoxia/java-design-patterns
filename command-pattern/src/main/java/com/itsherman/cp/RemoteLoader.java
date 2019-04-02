package com.itsherman.cp;

import com.itsherman.cp.command.*;
import com.itsherman.cp.control.RemoteControl;
import com.itsherman.cp.doer.CeilingFan;
import com.itsherman.cp.doer.Light;
import com.itsherman.cp.doer.Stereo;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,stereoOnWithCDCommand,stereoOffCommand);
        remoteControl.setCommand(3,ceilingFanHigh,ceilingFanOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPlushed(0);
        remoteControl.offButtonWasPlushed(0);
        remoteControl.onButtonWasPlushed(1);
        remoteControl.offButtonWasPlushed(1);
        remoteControl.onButtonWasPlushed(2);
        remoteControl.offButtonWasPlushed(2);
        remoteControl.onButtonWasPlushed(3);
        remoteControl.offButtonWasPlushed(3);

        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
