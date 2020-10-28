package com.mpoom.designpattern.creational.abstractfactory.example1.product;

/**
 * @description spring组合框：具体产品
 * @author: Yaoke.Hu
 * @date: 2020/10/28
 */
public class SpringComboBox extends ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框！");
    }
}
