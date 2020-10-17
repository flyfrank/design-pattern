package com.mpoom.designpattern.behavioral.command.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: FBSettingWindow是“功能键设置”窗口类
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class FBSettingWindow {
    // 窗口标题
    private String title;

    // 定义一个ArrayList来存储所有功能键
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton fb) {
        functionButtons.add(fb);
    }

    public void removeFunctionButton(FunctionButton fb) {
        functionButtons.remove(fb);
    }

    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键");
        functionButtons.stream().forEach(fb -> System.out.println(fb.getName()));
        System.out.println("-----------------------------------------");
    }
}
