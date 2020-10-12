package com.mpoom.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 战队控制中心：目标类
 * @author: Yaoke.Hu
 * @date: 2020/10/12
 */
public abstract class AllyControlCenter {
    // 战队名称
    protected String allyName;
    protected List<Observer> players = new ArrayList<>();

    /**
     * 注册方法
     * @param obs
     */
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    /**
     * 注销方法
     * @param obs
     */
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName);
        players.remove(obs);
    }

    /**
     * 声明抽象通知方法
     * @param name
     */
    public abstract void notifyObserver(String name);
}
