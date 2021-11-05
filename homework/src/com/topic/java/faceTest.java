package com.topic.java;

/**
 * 接口的基础语法:
 *      1,类和类之间叫继承,类和接口之间叫实现
 *      继承使用extends关键字完成
 *      实现使用implements关键字完成
 */

public class faceTest {
    public static void main(String[] args) {
        // 可以使用多态
        // 父类引用指向子类型的对象
        MyMath num = new MyMathImpl();
        // 调用接口里面的方法(面向接口编程)
        System.out.println(num.sum(1, 2));

        // MyMath是抽象的; 无法实例化
        // new MyMath();
    }
}

// 特殊的抽象类,完全抽象的,叫做接口
interface MyMath {
    double PI = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
}

/** 这样没问题
 * abstract class MyMathImpl implements MyMath {}
 */

// 编写一个类,(这个类是一个非抽象的类)
// 这个类的名字是随意的
// 想要实现一个接口必须要重写接口的所有方法
class MyMathImpl implements MyMath {
    // 重写/覆盖/实现 接口的方法(通常叫做实现)
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}