package com.topic.java;
/**
 * 抽象类:
 *      1,什么是抽象类？
 *          类和类直接具有共同特征，将这些共同特征提取出来，形成的就是抽象类。
 *          类到对象是实例化，对象到类是抽象化
 *      2,抽象类属于什么类型？
 *          抽象类也属于引用数据类型
 *      3,抽象类怎么定义？
 *          [语法]：
 *              【修饰符列表】 abstract class 类名 {
 *                  类体；
 *              }
 *      4,抽象类无法实例化的，无法创建对象的，所以抽象类是用来继承
 *
 *      5,final和abstract不能联合使用，这两个关键字是对立的
 *
 *      6,抽象类的子类可以是抽象类
 *
 *      7,抽象类虽然无法实例化，但是抽象类有构造方法。这个构造方法是供子类使用的
 *
 *      8,抽象类关联到一个概念:抽象方法，什么是抽象方法呢？
 *          抽象方法表示没有实现的方法，没有方法体的方法
 *          public abstract void doSome();
 *
 *      9,抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中
 */
public class AbstractTest01 {
    // 抽象类无法被实例化
    // BankAccounts bankAccounts = new BankAccounts();
}

// 银行账户类
abstract class BankAccounts {
    // 非抽象方法
    public void doSome() {
    }

    // 抽象方法
    public abstract void withDraw();
}

class CreditAccount extends BankAccounts {

    @Override
    public void withDraw() {

    }
}