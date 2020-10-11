package com.mpoom.designpattern.behavioral.templatemethod;

/**
 * @description: 模板方法模式调用类
 * @author: Yaoke.Hu
 * @date: 2020/10/11
 */
public class StartServer {
    public static void main(String[] args) {
        AbstractAccount account = new CurrentAccount();
        account.handle("张无忌", "123456");

        System.out.println();

        AbstractAccount account1 = new SavingAccount();
        account1.handle("张无忌", "123456");
    }
}
