package com.fish.java;

/*
    关于基本数据类型之间的相互转换，转换规则：
        1，八种基本数据类型当中除了布尔之外的7种数据类型都可以相互转换

        2，小容量向大容量转换，称为自动类型转换，容量从小到大排序:
            byte < short < int < long < float < double
                 < char
        warning:不管浮点类型占了几个字节，，都比整型数据容量大。
        char和short可表示的种类数量相同，但是char可以取更大的整数。

        3，大容量向小容量转换，称为强制类型转换，需要加强制类型转换符，
        程序才能编译通过，但是在运行阶段可能会损失精度，所以谨慎使用。

        4，当整数字面值没有超出byte,char,short的取值范围，可以直接
        赋值给byte,short,char类型的变量。

        5,byte,short,char混合运算的时候，各自先转换成int类型再运算。
*/

public class type_test {
    public static void main(String[] args) {
        int i = 10;
    }
}

class A {
    public void m(int x) {

    }
}
