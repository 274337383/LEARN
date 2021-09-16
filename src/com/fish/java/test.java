package com.fish.java;

public class test {
    public static void main(String[] args) {
        System.out.println("byte类型的取值范围");
        System.out.print(-Math.pow(2,7));
        System.out.print("~");
        System.out.println(Math.pow(2,7)-1);
        System.out.println(Byte.MIN_VALUE +"~"+Byte.MAX_VALUE);
        System.out.println("======================");
        System.out.println("short类型的取值范围");
        System.out.println(Short.MIN_VALUE +"~"+Short.MAX_VALUE);
        System.out.println("======================");
        System.out.println("int类型的取值范围");
        System.out.println(Integer.MIN_VALUE +"~"+Integer.MAX_VALUE);
        System.out.println("======================");
        System.out.println("long类型的取值范围");
        System.out.println(Long.MIN_VALUE +"~"+Long.MAX_VALUE);
        System.out.println("======================");
        System.out.println("float类型的取值范围");
        System.out.println(Float.MIN_VALUE +"~"+Float.MAX_VALUE);
        System.out.println("======================");
        System.out.println("double类型的取值范围");
        System.out.println(Double.MIN_VALUE +"~"+Double.MAX_VALUE);
        System.out.println("======================");
        System.out.println("char类型的取值范围");
        System.out.println("16进制转为int类型显示"+(int)Character.MIN_VALUE +"~"+(int)Character.MAX_VALUE);
    }
}
