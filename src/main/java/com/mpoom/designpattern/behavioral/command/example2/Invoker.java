package com.mpoom.designpattern.behavioral.command.example2;

/**
 * @description 增加了命令队列后，请求发送者Invoker将针对Commandqueue编程
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class Invoker {
    private CommandQueue commandQueue;

    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call() {
        commandQueue.execute();
    }
}
