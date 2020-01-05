package com.ming9;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 利用反射创建该类的对象
        Class clazz = Class.forName("com.ming9.Test");
        // 利用反射创建该类的对象
        Constructor constructor = clazz.getConstructor();
        // 创建该对象
        Object object = constructor.newInstance();
        // 获取show方法
        Method method = clazz.getMethod("show");
        // 调用方法
        method.invoke(object);

    }
}
