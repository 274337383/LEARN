package icu.maiddragon.web;

import icu.maiddragon.stack.ArrayStack;

public class Test {
    public static void main(String[] args) {
        String a = "4*5";

        ArrayStack numStack = new ArrayStack(10);
        ArrayStack symbolStack = new ArrayStack(10);

        int temp1 = 0;
        int temp2 = 0;
        int symbolChar = 0;
        int result = 0;
        StringBuilder values = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (symbolStack.isOper(c)) {
                if (!symbolStack.isEmpty()) {
                    if (symbolStack.priority(c) <= symbolStack.priority(symbolStack.peek())) {
                        temp1 = numStack.pop();
                        temp2 = numStack.pop();
                        symbolChar = symbolStack.pop();
                        symbolStack.calculate(temp1, temp2, symbolChar);

                        // 数字栈将结果推进栈中
                        numStack.push(result);
                        // 符号栈将运算符推入栈中
                        symbolStack.push(c);
                    }
                } else {
                    // 如果是空符号栈，将运算符推入栈中
                    symbolStack.push(c);
            }
        } else {
                values.append(c);

                if (i == a.length()-1) {
                    numStack.push(Integer.parseInt(values.toString()));
                } else {
                    char data = a.substring(i+1, i+2).charAt(0);
                    if (symbolStack.isOper(data)) {
                        numStack.push(Integer.parseInt(values.toString()));
                        values = new StringBuilder();
                    }
                }
            }
        }
        while (!symbolStack.isEmpty()) {

            temp1 = numStack.pop();
            temp2 = numStack.pop();

            symbolChar = symbolStack.pop();

            result = numStack.calculate(temp1, temp2, symbolChar);

            numStack.push(result);
        }

        int res = numStack.pop();

        System.out.println("结果是:" + res);
    }

    public static boolean detection(String val) {
        ArrayStack stack = new ArrayStack(val.length());

        for (int i = 0; i < val.length(); i++) {
            stack.push(val.charAt(i));
        }

        String newVal = "";
        int length1 = stack.length();
        for (int i = 0; i < length1; i++) {
            if (!stack.isEmpty()) {
                char pop = (char) stack.pop();
                newVal = newVal + pop;
            }
        }

        return val.equals(newVal);
    }
}
