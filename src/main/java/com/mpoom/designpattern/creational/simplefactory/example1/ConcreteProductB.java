package com.mpoom.designpattern.creational.simplefactory.example1;

/**
 * @description 具体产品类
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class ConcreteProductB extends Product {
    @Override
    public void methodDiff() {
        System.out.println("产品B执行具体业务方法");
    }
}
