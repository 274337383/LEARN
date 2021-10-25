package com.topic.java;

public class Test {
    public static void main(String[] args) {
        Number number = new Number(0, 100);
        System.out.println(number.getN1()+number.getN2());
        System.out.println(number.division(number.getN1(), number.getN2()));
    }
}
