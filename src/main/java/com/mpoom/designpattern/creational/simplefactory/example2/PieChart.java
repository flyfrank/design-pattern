package com.mpoom.designpattern.creational.simplefactory.example2;

/**
 * @description 饼状图： 具体产品类
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图!");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}
