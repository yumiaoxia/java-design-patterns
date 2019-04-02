package com.itsherman.cp;

import com.itsherman.cp.command.*;
import com.itsherman.cp.control.RemoteControl;
import com.itsherman.cp.doer.CeilingFan;
import com.itsherman.cp.doer.Light;
import com.itsherman.cp.doer.Stereo;

/**
 *  宏命令测试
 * @author Sherman
 * created in 2019/3/27
 */

public class RemoteMacroLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] macroOn = new Command[]{livingRoomLightOn,kitchenLightOn,ceilingFanHigh,stereoOnWithCD};
        Command[] macroOff = new Command[]{livingRoomLightOff,kitchenLightOff,ceilingFanOff,stereoOff};
        MacroCommand macroOnCommand = new MacroCommand(macroOn);
        MacroCommand macroOffCommand = new MacroCommand(macroOff);

        System.out.println(remoteControl);
        remoteControl.setCommand(0,macroOnCommand,macroOffCommand);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPlushed(0);
        remoteControl.offButtonWasPlushed(0);

        System.out.println("-------- when undoCommand executed --------");
        remoteControl.undoButtonWasPushed();
    }
}
