package com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.demo;

import com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.demo.impl.OperationAdd;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.demo.impl.OperationMultiply;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.demo.impl.OperationSubtract;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
