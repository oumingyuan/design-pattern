package com.example.designpattern.声明式编程.函数式编程.策略模式;


import com.example.designpattern.声明式编程.函数式编程.策略模式.impl.OperationAdd;
import com.example.designpattern.声明式编程.函数式编程.策略模式.impl.OperationMultiply;
import com.example.designpattern.声明式编程.函数式编程.策略模式.impl.OperationSubtract;

/**
 * 函数式编程的策略模式
 */
public class Main {


    public static void main(String[] args) {

        Strategy strategy = (int a, int b) -> new OperationAdd().doOperation(a, b);
        System.out.println("10 + 5 = " + strategy.doOperation(10, 5));

        strategy = (int a, int b) -> new OperationSubtract().doOperation(a, b);
        System.out.println("10 - 5 = " + strategy.doOperation(10, 5));

        strategy = (int a, int b) -> new OperationMultiply().doOperation(a, b);
        System.out.println("10 * 5 = " + strategy.doOperation(10, 5));


    }
}
