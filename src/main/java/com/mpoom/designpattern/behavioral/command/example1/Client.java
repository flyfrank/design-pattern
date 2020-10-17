package com.mpoom.designpattern.behavioral.command.example1;

/**
 * @description 客户端测试代码
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

        FunctionButton fb1, fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command command1, command2;

        command1 = new HelpCommand();
        command2 = new MinimizeCommand();

        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        // 调用功能键的业务方法
        fb1.onClick();
        fb2.onClick();
    }
}
