package com.fish.java;

import java.util.Objects;
import java.util.Scanner;

public class KeyBroad_Input2 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        String[] tianqiArray = {"下雨","晴天","寒冷","舒适","炎热"},
        sexArray = {"男","女"};
        String tianqi, sex, wendupj;

        for (int i = 0; i < 3; i++) {
            System.out.print("是否下雨(y/n):");
            String a = s.next();
            boolean b = false;
            if (Objects.equals(a, "y") || Objects.equals(a, "Y")) {
                b = true;
                break;
            } else if (Objects.equals(a, "n") || Objects.equals(a, "N")) {
                break;
            } else if (i == 3) {
                System.out.println("找茬是吧");

                break;
            }
            else {
                System.out.println("请输入y或者n");
                continue;
            }
        }
        for (int j = 0; j < 3; j++) {
            System.out.print("温度:");
            double wendu = Double.parseDouble(s.next());
            if (wendu < -60 || wendu > 60) {
                System.out.println("您住火星?");
                continue;
            } else {
                if (wendu <= 0) {
                    wendupj = tianqiArray[2];
                    break;
                } else if (wendu > 0 && wendu < 30) {
                    wendupj = tianqiArray[3];
                    break;
                } else {
                    wendupj = tianqiArray[4];
                    break;
                }
            }
        }

        System.out.print("请输入性别:");
        String a = s.next();

        if (Objects.equals(a, "男")) {

        } else if (Objects.equals(a, "女")){

        } else {
            System.out.println("外星人？");
        }

        s.close();
    }
}
