package com.product.Template;

public class StaticTest {
    static {
        System.out.println("类加载 >> 1");
    }
    static {
        System.out.println("类加载 >> 2");
    }
    static {
        System.out.println("类加载 >> 3");
    }

    public static void main(String[] args) {
        System.out.println("main Begin!");
    }
}
