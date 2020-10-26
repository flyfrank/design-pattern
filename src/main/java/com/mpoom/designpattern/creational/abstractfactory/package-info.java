package com.mpoom.designpattern.creational.abstractfactory;
/**
 * @description 抽象工厂模式
 * 抽象工厂模式定义
 * 抽象工厂模式：提供一个创建一个一系列相关或相互依赖的接口，而无需指定它们具体的类。抽象工厂模式又称为Kit模式,它是一种对象创建型模式。
 * 抽象工厂模式为创建一组对象提供了一种解决方案。与工厂方法模式相比,抽象工厂模式中的具体工厂不只是创建一种产品,它负责创建一族产品。
 *
 * 在抽象工厂模式中,每一个具体工厂都提供了多个工厂方法用于产生多种不同类型的产品,这些产品构成了一个产品族，抽象工厂模式结构图见：
 * abstract-factory-pattern.puml
 * @author: Yaoke.Hu
 * @date: 2020/10/26
 */