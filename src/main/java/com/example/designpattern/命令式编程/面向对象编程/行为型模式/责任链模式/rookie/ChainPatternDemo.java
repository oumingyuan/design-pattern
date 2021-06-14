package com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.rookie;

import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.rookie.impl.ConsoleLogger;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.rookie.impl.ErrorLogger;
import com.example.designpattern.命令式编程.面向对象编程.行为型模式.责任链模式.rookie.impl.FileLogger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        log.info("====================================================");
//        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        log.info("====================================================");
//        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
