@file:Suppress("PackageName")

package com.example.designpattern.命令式编程.面向对象编程.结构型模式.委派模式

// 创建接口
interface Base {
    fun print()
}

// 实现此接口的被委托的类
class BaseImpl(private val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

// 通过关键字 by 建立委托类
class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print() // 输出 10
}