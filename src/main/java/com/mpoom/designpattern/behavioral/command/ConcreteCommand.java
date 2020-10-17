package com.mpoom.designpattern.behavioral.command;

/**
 * @description: 具体命令类，继承抽象命令类，它与请求接收者相关联，实现抽象命令类中的execute() 方法，
 * 并实现调用接收者的请求响应方法action()
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class ConcreteCommand extends Command {
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
}
