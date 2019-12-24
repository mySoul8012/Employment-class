package com.ming9;

public class Main {
    public static void main(String[] args){
        Stack<String> stringStack = new StackImpl<String>();
        // 进行入栈操作
        stringStack.add("1111");
        stringStack.add("2222");
        stringStack.add("3333");
        stringStack.add("44444");
        // 获取长度
        System.out.println(stringStack.length());
        // 出栈
        stringStack.pop();
        // 再次获取长度
        System.out.println(stringStack.length());
    }
}
