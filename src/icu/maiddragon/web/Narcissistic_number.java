package icu.maiddragon.web;

public class Narcissistic_number {
    public static void main(String[] args) {
        int a,b,c;
        for (int i = 100; i < 999; i++) {
            a = (int) Math.pow(i / 100.0, 3);
            b = (int) Math.pow((i / 10.0 % 10), 3);
            c = (int) Math.pow(i % 10, 3);
            int sum = a + b + c;
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
