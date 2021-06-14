@file:Suppress("PackageName")

package com.example.designpattern.命令式编程.面向对象编程.结构型模式.委派模式

class RealPrinter {
    // the "delegate"
    fun print() {
        println("something")
    }
}

class Printer {
    // the "delegator"
    private var p = RealPrinter() // create the delegate
    fun print() {
        p.print() // delegation
    }
}


fun main() {
    val printer = Printer()
    printer.print()
}
