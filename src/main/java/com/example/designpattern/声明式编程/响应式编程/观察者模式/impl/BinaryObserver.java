package com.example.designpattern.声明式编程.响应式编程.观察者模式.impl;

import com.example.designpattern.声明式编程.响应式编程.观察者模式.Observer;
import com.example.designpattern.声明式编程.响应式编程.观察者模式.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * 消费者
     */
    @Override
    public void update() {

        /*
         * 处理数据流  Processor
         */
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
