package com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.jdk;


public class Employee implements Comparable<Employee> {
    //fields
    private final int empId;
    private final String name;
    private final int age;

    Employee(int empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    //Employee类实现Comparable接口，进行排序。实现compareTo方法
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }

    //seter and getter
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}






