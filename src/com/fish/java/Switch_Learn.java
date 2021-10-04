package com.fish.java;
import java.util.Scanner;

public class Switch_Learn {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        int x = Integer.parseInt(s.next());

        switch (x) {
            case 101:
                System.out.println("Hello");
                break;
            case 100:
                System.out.println("HelloWorld!");
                break;
                default:
        }
    }
}
