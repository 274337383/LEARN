package com.topic.java;

/**
 * 接口的基础语法:
 *      1,类和类之间叫继承,类和接口之间叫实现
 */

// 特殊的抽象类,完全抽象的,叫做接口
interface MyMath {
    double PI = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
}

// 编写一个类,(这个类是一个非抽象的类)
// 这个类的名字是随意的
class MyMathImpl {

}