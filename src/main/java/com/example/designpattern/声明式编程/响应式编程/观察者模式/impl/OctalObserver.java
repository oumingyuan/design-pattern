package com.example.designpattern.声明式编程.响应式编程.观察者模式.impl;

import com.example.designpattern.声明式编程.响应式编程.观察者模式.Observer;
import com.example.designpattern.声明式编程.响应式编程.观察者模式.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
