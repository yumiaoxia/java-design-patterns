package com.itsherman.cp.command;

import com.itsherman.cp.doer.CeilingFan;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class CeilingFanOffCommand implements Command {
    private final CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }


    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if(prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if(prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
