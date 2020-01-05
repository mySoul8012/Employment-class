package com.ming8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 获取class 对象
        Class clazz = Class.forName("com.ming8.Student");
        // 创建Object对象
        Object object = clazz.newInstance();
        // 调用Object方法
        Constructor constructor = clazz.getConstructor(int.class, String.class);
        // 调用object对象
        Object object1 = constructor.newInstance(23, "xiaoxiao");
        System.out.println(object1);
    }
}
