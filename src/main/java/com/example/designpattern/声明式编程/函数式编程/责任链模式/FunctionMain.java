package com.example.designpattern.声明式编程.函数式编程.责任链模式;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionMain {
    public static void main(String[] args) {
        UnaryOperator<String> headerProcessing = (String text) -> "From Raoul, Mario and Alan: " + text;
        UnaryOperator<String> spellCheckProcessing = (String text) -> text.replace("labda", "lambda");
        Function<String, String> function = headerProcessing.andThen(spellCheckProcessing);
        String result = function.apply("Aren't labdas really sexy?!!");
        System.out.println(result);
        UnaryOperator<String> hhhhhProcessing = (String text) -> text.concat("hhhh");
        Function<String, String> function1 = function.andThen(hhhhhProcessing);
        String result1 = function1.apply("Aren't labdas really sexy?!!");
        System.out.println(result1);
    }
}
