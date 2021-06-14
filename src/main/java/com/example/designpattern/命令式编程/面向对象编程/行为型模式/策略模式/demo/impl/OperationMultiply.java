package com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.demo.impl;

import com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.demo.Strategy;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}