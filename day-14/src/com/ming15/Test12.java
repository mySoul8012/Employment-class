package com.ming15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test12 {

    @Book(value = "ming", price = 23, author = {"xiaoxio", "ming"})
    public void sell() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        // 获取类
        Class c = Test12.class;
        // 获取方法
        Method method = c.getMethod("sell");
        // 进行判断
        if(method.isAnnotationPresent(Book.class)){
            // 获取类的数据，导入到Book类中
            Book book = method.getAnnotation(Book.class);
            // 打印
            System.out.println(book);
        }
    }
}
