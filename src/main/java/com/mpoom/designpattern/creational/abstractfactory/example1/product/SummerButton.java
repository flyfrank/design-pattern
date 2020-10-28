package com.mpoom.designpattern.creational.abstractfactory.example1.product;

/**
 * @description summer按钮：具体产品
 * @author: Yaoke.Hu
 * @date: 2020/10/28
 */
public class SummerButton extends Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮！");
    }
}
