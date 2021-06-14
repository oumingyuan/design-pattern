package com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.rookie.impl;

import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.rookie.AbstractLogger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
//        System.out.println("File::Logger: " + message);
        log.info("FileLogger|{}", message);

    }
}
