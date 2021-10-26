package com.topic.java;

public class AbstractTest02 {

}

abstract class Animals {
    public abstract void move();
}

class Bird extends Animals {
    @Override
    public void move() {
        System.out.println("鸟在飞!");
    }
}
