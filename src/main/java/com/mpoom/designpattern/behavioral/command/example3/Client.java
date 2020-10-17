package com.mpoom.designpattern.behavioral.command.example3;

/**
 * @description 客户端测试代码
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */
public class Client {

    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();
        AbstractCommand command = new AddCommand();

        calculatorForm.setCommand(command);

        calculatorForm.compute(10);
        calculatorForm.compute(5);
        calculatorForm.compute(10);
        calculatorForm.undo();
    }
}
