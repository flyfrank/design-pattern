package com.mpoom.designpattern.creational.prototype;

/**
 * @description
 * @author: Yaoke.Hu
 * @date: 2020/11/1
 */
public class ConcreteProtoType implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcreteProtoType p1 = new ConcreteProtoType();
        ConcreteProtoType p2 = (ConcreteProtoType) p1.clone();
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
