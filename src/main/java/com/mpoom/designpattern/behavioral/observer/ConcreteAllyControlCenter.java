package com.mpoom.designpattern.behavioral.observer;

/** 具体战队控制中心类： 具体目标类
 * @description:
 * @author: Yaoke.Hu
 * @date: 2020/10/12
 */
public class ConcreteAllyControlCenter  extends AllyControlCenter{


    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("------------------------------------------");
        this.allyName = allyName;
    }

    /**
     * 实现通知方法
     * @param name
     */
    public void notifyObserver(final String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        // 遍历观察者集合调用每一个盟友（自己除外）的支援方法
        players.stream()
                .filter(player -> !player.getName().equalsIgnoreCase(name))
                .forEach(player -> player.help());
    }
}
