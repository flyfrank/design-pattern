package com.mpoom.designpattern.creational.simplefactory.example1;

/**
 * @description 产品抽象类
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public abstract class Product {

    // 所有产品类的业务方法
    public void methodSame() {

    }

    // 声明抽象业务方法
    public abstract void methodDiff();
}
