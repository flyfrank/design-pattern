package com.mpoom.designpattern.creational.singleton;

/**
 * @description 饿汉模式
 * 当类被加载时,静态变量instance会被初始化,此时类的私有构造函数会被调用,单例类的唯
 * 一实例将被创建。如果使用饿汉式单例来实现负载均衡器LoadBalancer类的设计,则不会出现
 * 创建多个单例对象的情况,可确保单例对象的唯一性。
 * @author: Yaoke.Hu
 * @date: 2020/10/31
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
