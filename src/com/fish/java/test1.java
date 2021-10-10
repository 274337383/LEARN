package com.fish.java;

public class test1 {
    static String b = "Begin", o = "Over";
    public static void main(String[] args) {
        long  a = Input.long_input("请输入一个数:");
        Print.outln(sum(a));
    }

    public static long sum(long n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n-1);
    }
}