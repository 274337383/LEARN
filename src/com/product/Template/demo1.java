package com.product.Template;

public class demo1 {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        math.sum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },3,4);
    }
}