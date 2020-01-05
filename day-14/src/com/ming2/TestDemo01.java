package com.ming2;

import com.ming1.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestDemo01 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取class对象
        Class cc = Cat.class;
        // 通过构造方法获取对象
        Constructor constructor = cc.getConstructor();
        // 进行打印
        System.out.println(constructor);
        Constructor constructor1 = cc.getConstructor(String.class);
        // 进行打印
        System.out.println(constructor1);
        // 通过构造方法对象创建对象
        System.out.println("------");
        Object object = constructor1.newInstance();
        // 进行打印
        System.out.println(object);
        // 进行创建对象
        Object object1 = constructor.newInstance();
        // 进行打印
        System.out.println(object1);
        // 运行访问私有构造方法
        constructor1.setAccessible(true);
        // 进行打印
        Object object2 = constructor1.newInstance();
        // 进行打印
        System.out.println(object2);
    }
}
