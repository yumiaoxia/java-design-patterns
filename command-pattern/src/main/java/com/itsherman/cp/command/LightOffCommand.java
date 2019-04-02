package com.itsherman.cp.command;

import com.itsherman.cp.doer.Light;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
