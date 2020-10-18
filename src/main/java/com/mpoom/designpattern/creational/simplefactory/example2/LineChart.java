package com.mpoom.designpattern.creational.simplefactory.example2;

/**
 * @description 折线图： 具体产品类
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}
