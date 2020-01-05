package com.ming10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 创建实例
        Class clazz = Class.forName("com.ming10.Person");
        // 调用初始化方法
        Constructor constructor = clazz.getConstructor(String.class, String.class);
        // 调用初始化进行赋值
        // 进行初始化
        Person person = (Person)constructor.newInstance("xiaoxiao", "xiaoxiao");
        // 进行打印
        System.out.println(person);
        // 对age进行赋值
        Field field = clazz.getDeclaredField("age");
       // 设置可访问的
        field.setAccessible(true);
        // 进行赋值
        field.set(person, "23");
        // 进行打印
        System.out.println(person);
    }
}
