package com.ming;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("小小");
    }

    public void show(){
        System.out.println("show方法");
    }
}
