package com.ming3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String sex, String color, int age) {
        super(name, sex, color, age);
    }

    @Override
    public void eat() {
        System.out.println("吃小鱼");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉觉");
    }

    @Override
    public void say() {
        System.out.println("喵喵");
    }
}
