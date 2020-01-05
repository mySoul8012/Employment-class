package com.ming9;

import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 创建对象
        Student student = new Student();
        // 调用方法
        setProperty(student, "ming", "xiao");
        //输出值
        System.out.println(student);

        System.out.println(getProperty(student, "ming"));
    }


    public static void setProperty(Object object, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {
        // 字节码文件加载进入内存
        Class clazz = object.getClass();
        // 获取propertyName的方法
        Field field = clazz.getDeclaredField(propertyName);
        // 调用方法
        // 设置可访问的
        field.setAccessible(true);
        // 调用方法进行赋值
        field.set(object, value);
    }

    public static Object getProperty(Object object, String propertyName) throws NoSuchFieldException, IllegalAccessException {
        // 加载字节码文件
        Class clazz = object.getClass();
        // 获取对象
        // 获取对象
        Field field = clazz.getDeclaredField(propertyName);
        // 创建对象
        field.setAccessible(true);
        // 获取值
        return field.get(object);
    }
}
