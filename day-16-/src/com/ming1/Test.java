package com.ming1;

public class Test {
    public static void main(String[] args) {
        // 生成对象
        Dog dog = Dog.getInstance();
        Dog dog1 = Dog.getInstance();
        Dog dog2 = Dog.getInstance();
        // 进行打印
        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
