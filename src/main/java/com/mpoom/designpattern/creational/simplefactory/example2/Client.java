package com.mpoom.designpattern.creational.simplefactory.example2;

/**
 * @description 客户端测试代码
 * @author: Yaoke.Hu
 * @date: 2020/10/18
 */
public class Client {
    public static void main(String[] args) {
        // 通过静态工厂方法创建图表类
        Chart histogramChart = ChartFactory.getChart("histogram");
        histogramChart.display();

        Chart pieChart = ChartFactory.getChart("pie");
        pieChart.display();

        Chart lineChart = ChartFactory.getChart("line");
        lineChart.display();
    }
}
