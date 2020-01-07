package com.ming16;

import com.ming15.Book;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // 获取字节码文件
        Class clazz = Test.class;
        // 获取方法数组
        Method[] methods = clazz.getMethods();
        // 进行遍历
        for (Method method : methods) {
            // 进行遍历
            // 进行判断
            if(method.isAnnotationPresent(MyTest.class)){
                // 获取对象
                MyTest myTest = method.getAnnotation(MyTest.class);
                // 执行
                method.invoke(new Test());
            }
        }
    }
}
