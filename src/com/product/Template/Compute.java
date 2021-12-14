package com.product.Template;

public interface Compute {
    int sum(int a, int b);
}

class ComputeImpl implements Compute {
    public int sum(int a, int b) {
        return a + b;
    }
}

class MyMath {
    public void sum(Compute compute ,int a, int b) {
        int result = compute.sum(a, b);
        System.out.println(result);
    }
}
