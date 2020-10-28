package com.mpoom.designpattern.creational.abstractfactory.example1.product;

/**
 * @description spring文本框：具体产品
 * @author: Yaoke.Hu
 * @date: 2020/10/28
 */
public class SpringTextField extends TextField {
    @Override
    public void display() {
        System.out.println("显示边框为浅绿色的文本框！");
    }
}
