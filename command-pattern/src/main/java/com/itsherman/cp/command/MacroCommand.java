package com.itsherman.cp.command;

/**
 *  宏命令
 * @author Sherman
 * created in 2019/3/27
 */

public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length ; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.length-1; i >=0 ; i--) {
            commands[i].undo();
        }
    }
}
