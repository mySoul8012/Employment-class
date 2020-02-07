package com.ming;

public interface Animal {
    public abstract void eat();

    public default void show(){
        System.out.println("默认方法");
    }

    public static void demo(){
        System.out.println("静态方法");
    }

    public static final int AGE = 18;
}
