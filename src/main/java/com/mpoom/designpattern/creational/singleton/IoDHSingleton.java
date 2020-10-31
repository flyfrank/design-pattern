package com.mpoom.designpattern.creational.singleton;

/**
 * @description IoDH实现单例模式
 *
 * 饿汉式单例类不能实现延迟加载, 不管将来用不用始终占据内存;懒汉式单例类线程安全控
 * 制烦琐,而且性能受影响。可见,无论是饿汉式单例还是懒汉式单例都存在这样那样的问
 * 题,有没有一种方法,能够将两种单例的缺点都克服,而将两者的优点合二为一呢?答案
 * 是:Yes!下面我们来学习这种更好的被称之为Initialization Demand Holder (IoDH)的技术。
 * 在IoDH中,我们在单例类中增加一个静态(static)内部类,在该内部类中创建单例对象,再将
 * 该单例对象通过getInstance()方法返回给外部使用。
 *
 * 由于静态单例对象没有作为Singleton的成员变量直接实例化,因此类加载时不会实例化Singleton,第一次
 * 调用getInstance()时将加载内部类HolderClass,在该内部类中定义了一个static类型的变量
 * instance,此时会首先初始化这个成员变量,由Java虚拟机来保证其线程安全性,确保该成员
 * 变量只能初始化一次。由于getInstance()方法没有任何线程锁定,因此其性能不会造成任何影响。
 *
 * 通过使用IoDH,我们既可以实现延迟加载,又可以保证线程安全,不影响系统性能,不失为一种最好的Java语言单例模式实现方式
 * @author: Yaoke.Hu
 * @date: 2020/10/31
 */
public class IoDHSingleton {

    private IoDHSingleton() {}

    private static class HolderClass {
        public static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        IoDHSingleton instance1 = IoDHSingleton.getInstance();
        IoDHSingleton instance2 = IoDHSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
