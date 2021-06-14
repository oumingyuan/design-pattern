package com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.impl;

import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.Handler;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.leave.ILeave;

public class BigManager extends Handler {
    public BigManager() {
        //部门经理处理7天以上的请假
        super(Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
