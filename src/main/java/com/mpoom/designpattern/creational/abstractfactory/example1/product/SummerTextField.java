package com.mpoom.designpattern.creational.abstractfactory.example1.product;

/**
 * @description summer文本框：具体产品
 * @author: Yaoke.Hu
 * @date: 2020/10/28
 */
public class SummerTextField extends TextField {
    @Override
    public void display() {
        System.out.println("显示边框颜色为浅蓝色的文本框！");
    }
}
