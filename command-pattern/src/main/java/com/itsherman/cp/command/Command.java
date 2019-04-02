package com.itsherman.cp.command;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public interface Command {
    void execute();
    void undo();
}
