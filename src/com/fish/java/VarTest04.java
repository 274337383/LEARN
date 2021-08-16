package com.fish.java;
/*
    关于变量的分类:
        根据变量声明的位置来分类:
            * 局部变量
                - 在方法体当中声明的变量叫做局部变量

            *成员变量
                - 在方法体外声明的
*/
public class VarTest04 {

    static int k = 200;

    public static void main(String[] args) {

        int i = 10;
        System.out.println(k);
        dosome();
    }

    int i = 100;

    public static void dosome() {
        int i = 90;
        System.out.println(k + i);
    }
}
