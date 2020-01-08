package com.ming;

public class Test {
    public static void main(String[] args) {
        // 生成对象
        Dog dog = Dog.getInstance();
        // 打印对象
        System.out.println(dog);
        // 生成对象
        Dog dog1 = Dog.getInstance();
        // 打印对象
        System.out.println(dog1);
        // 生成对象
        Dog dog2 = Dog.getInstance();
        // 打印对象
        System.out.println(dog2);
    }
}
