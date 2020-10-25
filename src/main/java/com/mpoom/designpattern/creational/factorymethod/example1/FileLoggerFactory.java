package com.mpoom.designpattern.creational.factorymethod.example1;

/**
 * @description 文件日志记录器工厂类:具体工厂
 * @author: Yaoke.Hu
 * @date: 2020/10/25
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
