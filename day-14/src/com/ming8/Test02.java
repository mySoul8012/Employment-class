package com.ming8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 获取class对象
        Class clazz = Class.forName("com.ming8.Student");
        // 进行对象创建
        Object object = clazz.newInstance();
        // 通过制定构造方法
        Constructor constructor  = clazz.getConstructor(int.class, String.class);
        // 创建对象
        Object object1 = constructor.newInstance(23, "xiao");
        // 打印对象
        System.out.println(object1);
    }
}
