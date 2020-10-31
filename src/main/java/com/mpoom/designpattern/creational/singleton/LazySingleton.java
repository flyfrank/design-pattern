package com.mpoom.designpattern.creational.singleton;

/**
 * @description 懒汉模式
 * 该懒汉式单例类在getInstance()方法前面增加了关键字synchronized进行线程锁,以处理多个线
 * 程同时访问的问题。但是,上述代码虽然解决了线程安全问题,但是每次调用getInstance()时
 * 都需要进行线程锁定判断,在多线程高并发访问环境中,将会导致系统性能大大降低。
 * @author: Yaoke.Hu
 * @date: 2020/10/31
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {}

    synchronized public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
