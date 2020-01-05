package com.ming;

import java.lang.reflect.Constructor;

public class TestDemo03 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        // 获取class对象
        Class c = Class.forName("String");
        Class cc = Cat.class;
        // 获取构造方法对象
        Constructor constructor = cc.getConstructor();
        System.out.println(constructor);
        Constructor constructor1 = cc.getConstructor();
        System.out.println();
    }
}
