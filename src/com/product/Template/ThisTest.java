package com.product.Template;

public class ThisTest {
    public void doSome() {
        Print.outln("doSome!");
    }

    public void run() {
        Print.outln("run execute!");
        doSome();
    }
}
