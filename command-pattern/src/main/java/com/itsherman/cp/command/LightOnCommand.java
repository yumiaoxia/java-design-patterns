package com.itsherman.cp.command;

import com.itsherman.cp.doer.Light;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class LightOnCommand implements Command{

    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
