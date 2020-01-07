package com.ming16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main01 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // 获取字节码文件
        Class clazz = Test.class;
        // 获取方法数组
        Method[] methods = clazz.getMethods();
        // 进行遍历
        for (Method method : methods) {
            // 进行遍历
            // 进行判断
            // 判断是否有注解
            if(method.isAnnotationPresent(MyTest.class)){
                // 进行输出
                // 如果注解存在，进行执行
                method.invoke(new Test());
            }
        }
    }
}
