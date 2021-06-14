package com.example.designpattern.声明式编程.响应式编程.观察者模式;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
