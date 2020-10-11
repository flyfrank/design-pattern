package com.mpoom.designpattern.behavioral.templatemethod;

/**
 * @description: 模板方法模式应用实例
 * 1. 实例说明
 * 某软件公司欲为某银行的业务支撑系统开发一个利息计算模块,利息计算流程如下:
 * (1) 系统根据账号和密码验证用户信息,如果用户信息错误,系统显示出错提示;
 * (2) 如果用户信息正确,则根据用户类型的不同使用不同的利息计算公式计算利息(如活期账户和定期账户具有不同的利息计算公式);
 * (3) 系统显示利息。
 *
 * 这里只实现了活期账户和定期账户，如果要增加新的账户类型，原有代码无需修改，完全符合开闭原则。
 * @author: Yaoke.Hu
 * @date: 2020/10/11
 */
public abstract class AbstractAccount {

    /**
     * 基本方法：验证用户信息
     * @param account
     * @param password
     * @return
     */
    public boolean validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        // 模拟用户登录
        if("张无忌".equals(account) && "123456".equals(password)) {
            return true;
        }
        return false;
    }

    /**
     * 基本方法：计算利息
     */
    public abstract void calculateInterest();

    /**
     * 基本方法： 显示利息
     */
    public void display() {
        System.out.println("显示利息!");
    }


    public void handle(String account, String password) {
        if(!validate(account, password)) {
            System.out.println("账户或密码错误！");
            return;
        }
        calculateInterest();
        display();
    }

}
