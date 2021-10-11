package com.product.java;

public class Main {
    public static void main(String[] args) {
        Product iphone_13 = new Product();
        iphone_13.price = 5999;

        User user = new User();

        Print.out("iphone 13 price:"+iphone_13.price);
    }
}
