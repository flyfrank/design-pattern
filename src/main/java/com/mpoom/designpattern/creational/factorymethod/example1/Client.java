package com.mpoom.designpattern.creational.factorymethod.example1;

/**
 * @description
 * @author: Yaoke.Hu
 * @date: 2020/10/25
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new FileLoggerFactory();
        loggerFactory.createLogger().writeLog();

        LoggerFactory loggerFactory1 = new DatabaseLoggerFactory();
        loggerFactory1.createLogger().writeLog();
    }
}
