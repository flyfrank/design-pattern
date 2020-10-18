package com.mpoom.designpattern.creational.simplefactory.example2;

/**
 * @description 图表工厂类：工程类
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;

        if("histogram".equalsIgnoreCase(type)) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图!");
        } else if ("pie".equalsIgnoreCase(type)) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图!");
        } else if("line".equalsIgnoreCase(type)) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;
    }
}
