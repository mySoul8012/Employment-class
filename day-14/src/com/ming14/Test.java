package com.ming14;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 使用反射获取 Student Class对象
        Class clazz = Student.class;
        // 获取公有 全参构造方法
        Constructor constructor  = clazz.getConstructor();
        Constructor constructor1 = clazz.getConstructor(String.class, int.class);
        // 调用构造方法传入参数
        Object object = constructor1.newInstance("柳岩", 17);
        //获取方法
        Method method = clazz.getMethod("show");
        // 进行调用
        method.invoke(object);
    }
}
