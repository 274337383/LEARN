package com.product.java;

public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = "张三";

        Customer c2 = new Customer();
        c2.name = "李四";

        c1.shopping();
        c2.shopping();
    }
}
