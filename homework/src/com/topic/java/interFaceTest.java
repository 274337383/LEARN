package com.topic.java;

/**
 * 接口:
 *      1, 接口也是一种“数据引用类型”，编译之后也是一个class字节码文件
 *      2, 接口是完全抽象的，（抽象类是半抽象..）或者可以说接口是特殊的接口类
 *      3, 接口怎么定义，语法是什么?
 *          [修饰符列表] interface 接口名 {}
 *      4, 接口支持多继承，一个接口可以继承多个接口
 *      5, 接口类中只包含两部分,一部分是:"常量",一部分是:"抽象方法"
 *      6, 接口中所有元素都是public修饰的
 */


public class interFaceTest {

}
// 定义接口
interface A {}

// 接口支持继承
interface B extends A {}

// 接口支持多继承
interface C extends A, B {}

//interface MyMath {
//    int sumInt (int a, int b);
//
//    // 接口当中既然都是抽象方法,那么在编写代码的时候,public abstract可以忽略吗？
//}