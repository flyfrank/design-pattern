package com.mpoom.designpattern.creational.singleton;

/**
 * @description 懒汉模式
 * 双重检测锁
 * 由于volatile关键字会屏蔽Java虚拟机所做的一
 * 些代码优化,可能会导致系统运行效率降低,因此即使使用双重检查锁定来实现单例模式也
 * 不是一种完美的实现方式。
 * @author: Yaoke.Hu
 * @date: 2020/10/31
 */
public class DoubleCheckLockSingleton {

    // 必须增加volatile修饰
    private static volatile DoubleCheckLockSingleton instance;

    private DoubleCheckLockSingleton() {}

    public static DoubleCheckLockSingleton getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockSingleton();
                }
            }
        }
        return instance;
    }
}
