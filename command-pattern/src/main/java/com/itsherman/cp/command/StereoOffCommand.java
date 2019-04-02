package com.itsherman.cp.command;

import com.itsherman.cp.doer.Stereo;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class StereoOffCommand implements Command {
    private final Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
