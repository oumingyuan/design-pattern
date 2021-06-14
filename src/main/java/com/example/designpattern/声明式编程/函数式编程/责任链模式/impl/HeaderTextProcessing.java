package com.example.designpattern.声明式编程.函数式编程.责任链模式.impl;

import com.example.designpattern.声明式编程.函数式编程.责任链模式.ProcessingObject;

public class HeaderTextProcessing extends ProcessingObject<String> {
    @Override
    protected String handleWork(String input) {
        return "From Raoul, Mario and Alan: " + input;
    }
}

