package com.topic.java;

public class Vehicle {
    private Double speed, size;

    public Vehicle(Double speed, Double size) {
        this.speed = speed;
        this.size = size;
        System.out.println("速度:"+speed+" KM/H");
        System.out.println("体积:"+size+" 升");
    }

    public Double getSize() {
        return size;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("速度:"+speed+" KM/H");
        System.out.println("体积:"+size+" 升");
    }

    public void speedUp(double value) {
        speed -= value;
    }

    public void speedDown(double value) {
        speed -= value;
    }
}
