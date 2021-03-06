package com.mpoom.designpattern.creational.factorymethod.example1;

/**
 * @description 数据库日志记录器:具体产品
 * @author: Yaoke.Hu
 * @date: 2020/10/25
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志日记！");
    }
}
