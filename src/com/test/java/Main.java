package com.test.java;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal bird = new Bird();
        if (cat instanceof Animal) {
            Cat cat1 = (Cat) cat;
            cat1.move();
        } else if (bird instanceof Animal) {
            Bird bird1 = (Bird) bird;
            bird1.move();
        }
    }
}

class Cat extends Animal {
    public void move() {
        System.out.println("猫在移动");
    }
}

class Bird extends Animal {
    public void move() {
        System.out.println("小鸟在飞行");
    }
}