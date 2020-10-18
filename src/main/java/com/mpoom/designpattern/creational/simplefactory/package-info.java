package com.mpoom.designpattern.creational.simplefactory;
/**
 * @description 简单工厂模式
 * 简单工厂模式定义如下：
 * 简单工厂模式： 定义一个工厂类，它可以根据参数的不同返回不同类的实例，被创建的实例通常都具有共同的父类。
 * 因为在简单工程模式中用于创建实例的方法是静态（static）方法，因此简单工程模式又被称为静态工厂发（Static Factory Method）模式，它属于类创
 * 建型模式。
 *
 * 在简单工厂模式结构图中包含如下几个角色:
 * （1）Factory(工厂角色):工厂角色即工厂类,它是简单工厂模式的核心,负责实现创建所有产
 * 品实例的内部逻辑;工厂类可以被外界直接调用,创建所需的产品对象;在工厂类中提供了
 * 静态的工厂方法factoryMethod(),它的返回类型为抽象产品类型Product。
 * （2）Product(抽象产品角色):它是工厂类所创建的所有对象的父类,封装了各种产品对象的
 * 公有方法,它的引入将提高系统的灵活性,使得在工厂类中只需定义一个通用的工厂方法,
 * 因为所有创建的具体产品对象都是其子类对象。
 * （3）ConcreteProduct(具体产品角色):它是简单工厂模式的创建目标,所有被创建的对象都充
 * 当这个角色的某个具体类的实例
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */