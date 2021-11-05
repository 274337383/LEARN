package com.topic.java;

public class Test01 {
    public static void main(String[] args) {
        Cat hua = new Cat();
        hua.fly();
    }
}

class Animal {}

interface Flyable {
    void fly();
}

class Cat extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("猫在飞");
    }
}
