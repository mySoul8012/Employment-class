package com.ming9;

import java.lang.reflect.Field;

public class Test04 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 生成对象
        Student student = new Student();
        // 进行数据添加
        setProperty(student, "ming", "xiaoxiao");
        System.out.println(student);
        // 进行数据赋值
        System.out.println(getProperty(student, "ming"));
    }


    public static void setProperty(Object object, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {
        // 获取propertyName属性的值
        // 加载字节码文件
        Class clazz = object.getClass();
        // 加载文件
        // 获取方法对象
        Field field = clazz.getDeclaredField(propertyName);
        // 设置可以属性的
        field.setAccessible(true);
        // 设置属性组
        field.set(object, value);
    }

    public static Object getProperty(Object object, String propertyName) throws NoSuchFieldException, IllegalAccessException {
        // 加载字节码文件
        Class clazz = object.getClass();
        // 获取属性值
        Field field = clazz.getDeclaredField(propertyName);
        // 设置可访问
        field.setAccessible(true);
        // 获取值
        return field.get(object);
    }
}
