package com.mpoom.designpattern.behavioral.command;

/**
 * @description: 请求接收者，实现对请求的业务处理，它提供了action()方法，用于执行与请求相关的操作。
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class Receiver {
    public void action() {
        System.out.println("请求接收者处理请求!");
    }
}
