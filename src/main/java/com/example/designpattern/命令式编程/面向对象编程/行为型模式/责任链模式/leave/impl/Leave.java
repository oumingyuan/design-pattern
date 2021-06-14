package com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.impl;

import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.ILeave;

public class Leave implements ILeave {
    private final String name;//姓名
    private final int num;//请假天数
    private final String content;//请假内容

    public Leave(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
