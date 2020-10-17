package com.mpoom.designpattern.behavioral.command.example2;

import com.mpoom.designpattern.behavioral.command.example1.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 命令队列
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class CommandQueue {

    // 定义一个命令队列存储命令队列
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }
    public void removeCommand(Command command) {
        commands.remove(command);
    }

    // 循环调用每一个命令对象的execute()方法
    public void execute() {
        commands.stream().forEach(command -> command.execute());
    }
}
