package com.ming9;

import java.lang.reflect.Field;

public class Test0 {
    public static void main(String[] args){
        // obj 对象中为 propertyName 属性值，设置为 value

    }

    public static void setProperty(Object object, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {
        // obj对象中名为 propertyName 属性的值设置为 value
        // 获取字节码文件
        Class clazz = object.getClass();
        // 设置属性可以访问
        Field field = clazz.getDeclaredField(propertyName);
        // 调用值，进行赋值操作
        // 设置可访问的
        field.setAccessible(true);
        // 进行赋值操作
        field.set(object, value);
    }

    public static Object getProperty(Object object, String propertyName) throws NoSuchFieldException, IllegalAccessException {
        // 获取字节码对象
        Class clazz = object.getClass();
        // 获取方法
        Field field = clazz.getDeclaredField(propertyName);
        // 设置可以访问
        field.setAccessible(true);
        // 获取对应的值
        return field.get(object);
    }
}
