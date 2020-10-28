package com.mpoom.designpattern.creational.abstractfactory.example1.factory;

import com.mpoom.designpattern.creational.abstractfactory.example1.product.*;

/**
 * @description Summer皮肤工厂:具体工厂
 * @author: Yaoke.Hu
 * @date: 2020/10/28
 */
public class SummerSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
