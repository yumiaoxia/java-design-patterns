package com.itsherman.cp.command;

import com.itsherman.cp.doer.Stereo;

/**
 * 音响播放CD命令对象
 * @author Sherman
 * created in 2019/3/27
 */

public class StereoOnWithCDCommand implements Command {
    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
