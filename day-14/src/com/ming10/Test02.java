package com.ming10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 利用反射创建一个实例
        Class clazz = Class.forName("com.ming10.Person");
        // 创建实例
        Constructor  constructor = clazz.getConstructor(String.class, String.class);
        // 创建对象
        Person person = (Person) constructor.newInstance("2", "33");
        // 进行打印
        System.out.println(person);
        // 进行赋值
        // 创建File对象
        Field field = clazz.getDeclaredField("age");
        // 创建可访问
        field.setAccessible(true);
        // 进行赋值操作
        field.set(person, "23");
        // 进行打印
        System.out.println(person);
    }
}
