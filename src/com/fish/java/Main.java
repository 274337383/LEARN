package com.fish.java;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Mike";
        person.house = new House();
        person.house.area = 300.6;
        person.house.address = new Address();
        person.house.address.Address = "China";


    }
}
