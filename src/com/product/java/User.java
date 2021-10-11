package com.product.java;

public class User {
        public User() {
            Print.outln("User's Default Constructor Invoke!");
        }

        public User(String name) {
            Print.outln(name);
        }

        public User(int num) {
            int k = 0;
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    k = i * j;
                    Print.out(i+"*"+j+"="+k+" ");
                }
                Print.outln();
            }
        }
}
