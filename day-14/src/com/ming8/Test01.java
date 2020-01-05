package com.ming8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
       // 获取 Class 对象
        Class clazz = Class.forName("com.ming8.Student");
        //通过class对象方法创建
        Object object = clazz.newInstance();
        // 打印结果
        System.out.println(object);
        // 通过constructor对象创建
        Constructor constructor = clazz.getConstructor(int.class, String.class);
        // 创建对象
        Object object1 = constructor.newInstance(23, "ming");
        // 打印
        System.out.println(object1);
    }
}
