package com.mpoom.designpattern.behavioral.command.example1;

/**
 * @description: 帮助命令类： 具体命令类
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class HelpCommand extends Command {
    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
