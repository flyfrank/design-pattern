package com.mpoom.designpattern.behavioral.observer;

/**
 * @description: 战队成员类：具体观察者类
 * @author: Yaoke.Hu
 * @date: 2020/10/12
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 支援盟友方法的实现
     */
    public void help() {
        System.out.println("坚持住," + this.name + "来救你！");
    }

    /**
     * 遭受攻击方法实现，当遭受攻击时将调用战队控制中心类的通知方法notifyObserver
     * @param acc
     */
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);
    }
}
