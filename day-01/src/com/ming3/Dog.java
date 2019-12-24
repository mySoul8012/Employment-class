package com.ming3;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, String sex, String color, int age) {
        super(name, sex, color, age);
    }

    @Override
    public void eat() {
        System.out.println("吃东东");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public void say() {
        System.out.println("旺旺");
    }
}
