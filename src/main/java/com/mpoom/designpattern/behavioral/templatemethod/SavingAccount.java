package com.mpoom.designpattern.behavioral.templatemethod;

/**
 * @description: 定期账户类
 * @author: Yaoke.Hu
 * @date: 2020/10/11
 */
public class SavingAccount extends AbstractAccount {
    public void calculateInterest() {
        System.out.println("按照定期利率计算利息！");
    }
}
