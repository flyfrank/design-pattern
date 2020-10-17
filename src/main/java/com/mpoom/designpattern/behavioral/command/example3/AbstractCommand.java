package com.mpoom.designpattern.behavioral.command.example3;

/**
 * @description
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public abstract class AbstractCommand {

    public abstract int execute(int value);

    public abstract int undo();
}
