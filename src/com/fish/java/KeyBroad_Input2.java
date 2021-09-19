package com.fish.java;

import java.util.Objects;
import java.util.Scanner;

public class KeyBroad_Input2 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        String[] tianqiArray = {"下雨","晴天","寒冷","舒适","炎热","大黑伞","小花伞","晴天"},
        sexArray = {"男","女"};
        String tianqi = null, sex, wendupj,san;
        double wendu = 0.0;


        for (int i = 0; i < 3; i++) {
            System.out.print("是否下雨(y/n):");
            String a = s.next();
            if (Objects.equals(a, "y") || Objects.equals(a, "Y")) {
                tianqi = tianqiArray[0];
                break;
            } else if (Objects.equals(a, "n") || Objects.equals(a, "N")) {
                tianqi = tianqiArray[7];
                break;
            } else if (i == 3) {
                System.out.println("找茬是吧");
                tianqi = "unknown";
                break;
            }
            else {
                System.out.println("请输入y或者n");
                continue;
            }
        }
        for (int j = 0; j < 3; j++) {
            System.out.print("温度:");
            wendu = Double.parseDouble(s.next());
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
            sex = sexArray[0];
        } else if (Objects.equals(a, "女")){
            sex = sexArray[1];
        } else {
            System.out.println("外星人？");
            sex = "unknown";
            san = "unknown";
        }
        if (Objects.equals(tianqi, "下雨")) {
            if (sex.equals("男")) {
                san = tianqiArray[5];
            } else if (sex.equals("女")) {
                san = tianqiArray[6];
            }
        } else {
            san = "unknown";
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("信息:");
        System.out.println("\t性别:"+sex);
        System.out.println("\t天气:"+tianqi);
        // System.out.println("\t伞:"+san);
        System.out.println("\t温度:"+wendu);

        s.close();
    }
}
