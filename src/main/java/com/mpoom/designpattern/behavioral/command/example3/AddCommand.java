package com.mpoom.designpattern.behavioral.command.example3;

import com.mpoom.designpattern.behavioral.templatemethod.AbstractAccount;

/**
 * @description
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class AddCommand extends AbstractCommand {
    private Adder adder;
    private int value;

    public AddCommand() {
        this.adder = new Adder();
    }

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
