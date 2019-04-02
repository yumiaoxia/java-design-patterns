package com.itsherman.cp.control;

import com.itsherman.cp.command.Command;
import com.itsherman.cp.command.NoCommand;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
       onCommands[slot] = onCommand;
       offCommands[slot] = offCommand;
    }

    public void onButtonWasPlushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPlushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n----- Remote Control -----\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuffer.append("[slot "+i+"]"+onCommands[i].getClass().getSimpleName()+"   "+offCommands[i].getClass().getSimpleName()+"\n");
        }
        return stringBuffer.toString();
    }
}
