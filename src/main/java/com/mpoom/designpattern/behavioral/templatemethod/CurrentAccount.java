package com.mpoom.designpattern.behavioral.templatemethod;

/**
 * @description: 活期账户类型
 * @author: Yaoke.Hu
 * @date: 2020/10/11
 */
public class CurrentAccount extends AbstractAccount{

    public void calculateInterest() {
        System.out.println("按照活期利率计算利息！");
    }
}
