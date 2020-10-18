package com.mpoom.designpattern.creational.simplefactory.example1;

/**
 * @description 客户端测试代码
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class Client {
    public static void main(String[] args) {
        // 通过工厂类创建产品对象
        Product product = Factory.getProduct("A");

        product.methodSame();
        product.methodDiff();
    }
}
