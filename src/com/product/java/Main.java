package com.product.java;

import com.product.Template.Chinese;
import com.product.Template.User;

public class Main {
    public static void main(String[] args) {
        User user = new Chinese(1,"张三");
        System.out.println(user.toString());
        user.setName("李四");
        System.out.println(user.toString());
    }
}
