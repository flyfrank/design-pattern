package com.mpoom.designpattern.behavioral.command.example2;
/**
 * @description 命令队列的实现
 * 有时我们需要将过个请求排队，当一个请求发送者发送一个请求时，将不止一个请求接收者响应，这些请求接收者逐个执行业务方法，完成对请求的处理。
 * 此时，我们可以通过命令队列来实现。
 *
 * 命令队列的实现方法有多种形式，其中最常用、灵活性最好的一种方式是增加一个CommandQueue类，由该类负责存储多个命令对象，而不同的命令对象可以对
 * 应不同的请求接收者，CommandQueue类的典型代码如下所示：
 * @author: Yaoke.Hu
 * @date: 2020/10/17
 */