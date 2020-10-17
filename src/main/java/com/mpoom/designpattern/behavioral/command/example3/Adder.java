package com.mpoom.designpattern.behavioral.command.example3;

/**
 * @description 加法类——请求接收者
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class Adder {

    private int num = 0;

    public int add(int value) {
        num += value;
        return num;
    }
}
