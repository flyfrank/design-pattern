package com.mpoom.designpattern.creational.abstractfactory.example1;

import com.mpoom.designpattern.creational.abstractfactory.example1.factory.SkinFactory;
import com.mpoom.designpattern.creational.abstractfactory.example1.factory.SpringSkinFactory;
import com.mpoom.designpattern.creational.abstractfactory.example1.factory.SummerSkinFactory;

/**
 * @description 客户端测试代码
 * @author: Yaoke.Hu
 * @date: 2020/10/28
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory springSkinFactory = new SpringSkinFactory();
        springSkinFactory.createButton().display();
        springSkinFactory.createTextFiled().display();
        springSkinFactory.createComboBox().display();

        System.out.println("---------------");
        SkinFactory summerSkinFactory = new SummerSkinFactory();
        summerSkinFactory.createButton().display();
        summerSkinFactory.createTextFiled().display();
        summerSkinFactory.createComboBox().display();
    }
}
