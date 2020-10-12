package com.mpoom.designpattern.behavioral.observer;

/**
 * @description: 客户端测试代码
 * @author: Yaoke.Hu
 * @date: 2020/10/12
 */
public class Client {
    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");
        // 定义四个观察者对象
        Observer player1 = new Player("杨过");
        acc.join(player1);

        Observer player2 = new Player("令狐冲");
        acc.join(player2);

        Observer player3 = new Player("张无忌");
        acc.join(player3);

        Observer player4 = new Player("段誉");
        acc.join(player4);

        // 某成员遭受攻击
        player1.beAttacked(acc);
    }
}
