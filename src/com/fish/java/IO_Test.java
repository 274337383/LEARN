package com.fish.java;
/*

*/
public class IO_Test {
    public static void main() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"x"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
