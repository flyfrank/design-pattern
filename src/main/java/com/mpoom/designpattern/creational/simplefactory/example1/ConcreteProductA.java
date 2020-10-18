package com.mpoom.designpattern.creational.simplefactory.example1;

/**
 * @description 具体产品类
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class ConcreteProductA extends Product {
    @Override
    public void methodDiff() {
        System.out.println("ProductA 执行了业务处理方法！");
    }
}
