package com.example.designpattern.命令式编程.面向对象编程.行为型模式.策略模式.jdk;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> col = new ArrayList<>();
        col.add(new Employee(5, "Frank", 28));
        col.add(new Employee(1, "Jorge", 19));
        col.add(new Employee(6, "Bill", 34));
        col.add(new Employee(3, "Michel", 10));
        col.add(new Employee(7, "Simpson", 8));
        col.add(new Employee(4, "Clerk", 16));
        col.add(new Employee(8, "Lee", 40));
        col.add(new Employee(2, "Mark", 30));
        System.out.println("Sorting by empId field : sort method by implement comparable interface");
        // sort method by implementing comparable interface
        Collections.sort(col);
        printList(col);
        System.out.println("Sorting by empId fieName : sort method implement comparator interface");
        col.sort(new EmpSortByName());
        //sort method by implementing comparator interface
        printList(col);
        System.out.println("Sorting by empId field : sort method implement comparator interface");
        //sort method by implementing comparator interface
        col.sort(new EmpSortById());
        printList(col);


        /*
         * 函数式
         */
        //3.使用Lambada表达式
        System.out.println("函数式写法");
        col.sort((Comparator.comparingInt(Employee::getAge)));
        printList(col);
    }

    private static void printList(List<Employee> list) {
        System.out.println("EmpId\tName\tAge");
        for (Employee e : list) {
            System.out.println(e.getEmpId() + "\t" + e.getName() + "\t" + e.getAge());
        }
    }
}
