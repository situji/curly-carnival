package com.pattern.command;

/**
 * @author pc
 * @since 2017/12/27.
 */
public interface Command {
    public void execute();
    public void undo();
}
