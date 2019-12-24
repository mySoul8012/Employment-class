package com.ming3;

// 定义公共类，动物
public abstract class Animal {
    private String name;
    private String sex;
    private String color;
    private int age;

    public Animal() {
    }

    public Animal(String name, String sex, String color, int age) {
        this.name = name;
        this.sex = sex;
        this.color = color;
        this.age = age;
    }

    // 吃
    public abstract void eat();

    // 睡觉
    public abstract void sleep();

    // 叫
    public abstract void say();
}
