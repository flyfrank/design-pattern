package com.mpoom.designpattern.behavioral.command;

/**
 * @description: 请求发送者，即调用者，针对抽象命令类编程
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
