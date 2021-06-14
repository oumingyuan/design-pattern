package com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave;

import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.impl.BigManager;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.impl.GroupLeader;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.impl.Leave;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.impl.Manager;

public class Main {
    public static void main(String[] args) {
        //请假条来一张
        ILeave leave = new Leave("小花", 3, "身体不适");

        //各位领导
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler bigManager = new BigManager();

        groupLeader.setNextHandler(manager);//小组长的领导是部门经理
        manager.setNextHandler(bigManager);//部门经理的领导是总经理
        //之所以在这里设置上级领导，是因为可以根据实际需求来更改设置，如果实战中上级领导人都是固定的，则可以移到领导实现类中。

        //提交申请
        groupLeader.submit(leave);
    }
}
