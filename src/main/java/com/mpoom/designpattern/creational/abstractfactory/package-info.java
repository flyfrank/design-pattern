package com.mpoom.designpattern.creational.abstractfactory;
/**
 * @description 抽象工厂模式
 * 抽象工厂模式定义
 * 抽象工厂模式：提供一个创建一个一系列相关或相互依赖的接口，而无需指定它们具体的类。抽象工厂模式又称为Kit模式,它是一种对象创建型模式。
 * 抽象工厂模式为创建一组对象提供了一种解决方案。与工厂方法模式相比,抽象工厂模式中的具体工厂不只是创建一种产品,它负责创建一族产品。
 *
 * 在抽象工厂模式中,每一个具体工厂都提供了多个工厂方法用于产生多种不同类型的产品,这些产品构成了一个产品族，抽象工厂模式结构图见：
 * abstract-factory-pattern.puml
 * 在抽象工厂模式结构图中包含如下几个角色:
 * ● AbstractFactory(抽象工厂):它声明了一组用于创建一族产品的方法,每一个方法对应一种产品。
 * ● ConcreteFactory(具体工厂):它实现了在抽象工厂中声明的创建产品的方法,生成一组具体产品,这些产品构成了一个产品族,每一个产品都位于某个产品等级结构中。
 * ● AbstractProduct(抽象产品):它为每种产品声明接口,在抽象产品中声明了产品所具有的业务方法。
 * ● ConcreteProduct(具体产品):它定义具体工厂生产的具体产品对象,实现抽象产品接口中声明的业务方法。
 * @author: Yaoke.Hu
 * @date: 2020/10/26
 */