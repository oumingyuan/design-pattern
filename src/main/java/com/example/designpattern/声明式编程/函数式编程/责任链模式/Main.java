package com.example.designpattern.声明式编程.函数式编程.责任链模式;

import com.example.designpattern.声明式编程.函数式编程.责任链模式.impl.HeaderTextProcessing;
import com.example.designpattern.声明式编程.函数式编程.责任链模式.impl.SpellCheckerProcessing;

public class Main {
    public static void main(String[] args) {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();

        p1.setSuccessor(p2);

        String result = p1.handler("Aren't labdas really sexy?!!");
        System.out.println(result);


    }
}
