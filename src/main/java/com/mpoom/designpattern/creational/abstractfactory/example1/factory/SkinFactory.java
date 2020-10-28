package com.mpoom.designpattern.creational.abstractfactory.example1.factory;

import com.mpoom.designpattern.creational.abstractfactory.example1.product.Button;
import com.mpoom.designpattern.creational.abstractfactory.example1.product.ComboBox;
import com.mpoom.designpattern.creational.abstractfactory.example1.product.TextField;

/**
 * @description 界面皮肤工厂接口:抽象工厂
 * @author: Yaoke.Hu
 * @date: 2020/10/28
 */
public abstract class SkinFactory {

    public abstract Button createButton();
    public abstract TextField createTextFiled();
    public abstract ComboBox createComboBox();
}
