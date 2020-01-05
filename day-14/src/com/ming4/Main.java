package com.ming4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // 获取目标类的字节码文件对象
        Class clazz = Demo.class;
        // 获取成员方法
        Method[] methods = clazz.getMethods();
        // 遍历
        for (Method method : methods) {
            // 进行遍历是否有注解
            if(method.isAnnotationPresent(MyTest.class)){
                // 执行该方法
                method.invoke(new Demo());
            }
        }
    }
}
