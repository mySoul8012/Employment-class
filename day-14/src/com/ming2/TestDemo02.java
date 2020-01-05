package com.ming2;

import java.lang.reflect.Method;

public class TestDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        // 获取class对象
        Class cc = Class.forName("com.ming1.Cat");
        // 获取成员方法
        Method method = cc.getMethod("eat", String.class, String.class);
        // 进行打印
        System.out.println(method);
        // 获取方法
        Method method1 = cc.getMethod("eat", String.class, String.class);
        // 进行打印
        System.out.println(method1);
        // 获取非公有的方法，使用getDeclaredMethod方法获取
        Method method2 = cc.getDeclaredMethod("eat");
        // 进行打印
        System.out.println(method2);
        // 使用成员方法对象
        Cat cat = new Cat();
        // 调用

    }
}
