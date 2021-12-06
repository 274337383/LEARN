package icu.maiddragon.stack;

public class ArrayStack {
    // 栈的大小
    private int maxStack;

    // 用数组来模拟栈
    private int[] stack;

    // 栈顶
    private int top = -1;

    // 构造函数
    public ArrayStack(int maxStack) {
        this.maxStack = maxStack;
        stack = new int[maxStack];
    }

    /**
     * 1.压栈
     * 2.弹栈
     * 3.判断是否空栈
     * 4.当前栈是否满栈
     */

    // 判断是否满栈
    public boolean isFull() {
        return this.top == this.maxStack-1;
    }

    // 判断是否空栈
    public boolean isEmpty() {
        return this.top == -1;
    }

    // 压栈方法
    public void push(int val) {
        if (isFull()) {
            throw new RuntimeException("满栈");
        }

        top++;

        stack[top] = val;
    }

    // 弹栈方法
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("空栈");
        }

        int value = stack[top];
        top--;
        return value;
    }


    // 查看栈中所有元素
    public void list() {
        if (isEmpty()) {
            throw new RuntimeException("空栈");
        }

        for (int i = 0; i < stack.length; i++) {
            System.out.printf("stack[%d] = %d", i, stack[i]);
        }
    }

    // 获得栈顶元素
    public int peek() {
        return this.stack[top];
    }

    // 获得栈容量
    public int StackLength() {
        return this.stack.length;
    }

    // 运算符优先级
    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    // 获取栈长度
    public int length() {
        return this.top+1;
    }

    public boolean isOper(char v) {
        return v=='+' || v=='-' || v=='*' || v=='/';
    }

    public int calculate(int num, int num1, int oper) {
        int result = 0;
        switch (oper) {
            case '+':
                result = num + num1;
                break;
            case '-':
                result = num1 - num;
                break;
            case '*':
                result = num * num1;
                break;
            case '/':
                result = num1 / num;
                break;
            default:
                break;
        }

        return result;
    }
}
