package com.ming;

public class Dog {
    private static Dog dd = new Dog();
    // private对象
    private Dog(){}

    // 提供进行方法
    public static Dog getInstance(){
        // 进行返回对象
        return dd;
    }
}
