package com.product.array;

import com.product.Template.Chinese;
import com.product.Template.User;

public class ArrayTest_01 {
    public static void main(String[] args) {
        User[][] users = new User[5][5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 4) {
                    users[i][j] = new Chinese(count,"张三");
                } else {                    users[i][j] = new User(count, "李四");
                }
                count++;
                System.out.print(users[i][j].toString()+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
