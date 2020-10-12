package com.mpoom.designpattern.behavioral.observer;

/**
 * @description:
 * @author: Yaoke.Hu
 * @date: 2020/10/12
 */
public interface Observer {
    public String getName();
    public void setName(String name);

    /**
     * 声明支援盟友方法
     */
    public void help();

    /**
     * 声明遭受攻击方法
     * @param acc
     */
    public void beAttacked(AllyControlCenter acc);
}
