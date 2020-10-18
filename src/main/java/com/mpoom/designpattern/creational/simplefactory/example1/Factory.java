package com.mpoom.designpattern.creational.simplefactory.example1;

/**
 * @description 静态工厂方法
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class Factory {
    // 静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if(arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
        } else if(arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
