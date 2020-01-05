package com.ming5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class clazz = Demo.class;
        // 获取目标类上的成员方法
        Method[] methods = clazz.getMethods();
        // 遍历判断
        for (Method method : methods) {
            // 判断方法上是否有注解
            if(method.isAnnotationPresent(MyTest.class)){
                // 执行该方法
                method.invoke(new Demo());
            }
        }
    }
}
