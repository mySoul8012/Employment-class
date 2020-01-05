package com.ming8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test04 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        // 加载对象
        Class clazz = Class.forName("com.ming8.Student");
        // 调用构造函数，创建对象
        Object object  = clazz.newInstance();
        // 获取构造方法
        Constructor constructor = clazz.getConstructor(int.class, String.class);
        // 生成对象
        Object object1 = constructor.newInstance(23, "xiaoxiao");
        System.out.println(object1);
    }
}
