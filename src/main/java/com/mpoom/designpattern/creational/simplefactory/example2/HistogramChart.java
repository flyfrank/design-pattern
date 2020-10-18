package com.mpoom.designpattern.creational.simplefactory.example2;

/**
 * @description 柱状图类：具体产品类
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }
}
