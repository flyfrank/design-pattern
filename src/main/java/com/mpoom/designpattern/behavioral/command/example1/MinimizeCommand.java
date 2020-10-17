package com.mpoom.designpattern.behavioral.command.example1;

/**
 * @description 最小化命令类
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class MinimizeCommand extends Command {
    private WindowHandler windowHandler;

    public MinimizeCommand() {
        windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
