package com.mpoom.designpattern.creational.abstractfactory.example1.factory;

import com.mpoom.designpattern.creational.abstractfactory.example1.product.*;

/**
 * @description Spring皮肤工厂:具体工厂
 * @author: Yaoke.Hu
 * @date: 2020/10/28
 */
public class SpringSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextFiled() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
