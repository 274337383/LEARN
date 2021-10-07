package com.fish.java;

public class Input {
    public static String input(String text) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print(text);
        return s.next();
    }
    public static int int_input(String text) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print(text);
        return Integer.parseInt(s.next());
    }
    public static float float_input(String text) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print(text);
        return s.nextFloat();
    }
    public static long long_input(String text) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print(text);
        return Long.parseLong(s.next());
    }
}
