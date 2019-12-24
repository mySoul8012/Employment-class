package com.ming4;

public interface Animal {
    public abstract  void eat();    // 抽象方法

    public default void show(){
        System.out.println("默认方法");
    }

    public static void demo(){
        System.out.println("静态方法");
    }

    public static final int AGE = 18;
}
