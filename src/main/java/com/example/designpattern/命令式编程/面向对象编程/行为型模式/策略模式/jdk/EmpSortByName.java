package com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.jdk;

import java.util.Comparator;

public class EmpSortByName implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
