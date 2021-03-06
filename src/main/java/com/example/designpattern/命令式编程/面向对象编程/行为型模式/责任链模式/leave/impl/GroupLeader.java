package com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.impl;

import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.Handler;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.ILeave;

public class GroupLeader extends Handler {

    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}
