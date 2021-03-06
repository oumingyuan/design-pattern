package com.example.designpattern.命令式编程.面向对象编程.创建型模式.工厂模式.普通;

import com.example.designpattern.命令式编程.面向对象编程.创建型模式.工厂模式.普通.impl.Circle;
import com.example.designpattern.命令式编程.面向对象编程.创建型模式.工厂模式.普通.impl.Rectangle;
import com.example.designpattern.命令式编程.面向对象编程.创建型模式.工厂模式.普通.impl.Square;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
