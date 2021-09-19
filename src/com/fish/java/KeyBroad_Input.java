package com.fish.java;

import java.util.Scanner;

public class KeyBroad_Input {
    public static void main(String[] args) {
        boolean b = true;
        // 第一步，创建键盘扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("年龄:");
        int a = Integer.parseInt(s.next());
        String age = "老年";
        if (a < 0 || a > 150) {
            System.out.println("年龄不合法!,原因:超出人类范围.");
            b = false;
        } else if (a <= 5) {
            age = "幼儿";
        } else if (a <= 10) {
            age = "少年";
        } else if (a <= 18) {
            age = "青少年";
        } else if (a <= 35) {
            age = "青年";
        } else if (a <= 55) {
            age = "壮年";
        } else {
            age = "老年";
        }

        if (b) {
            System.out.println("您是"+age+"阶段人群");
        }
    }
}
