package com.example.designpattern.命令式编程.面向对象编程.创建型模式.工厂模式.普通.impl;

import com.example.designpattern.命令式编程.面向对象编程.创建型模式.工厂模式.普通.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
