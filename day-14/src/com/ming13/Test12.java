package com.ming13;

import java.lang.reflect.Method;

public class Test12 {
    @Book(value = "小小", authors = {"ming", "xiaoxiao"}, price = 99)
    public void sell(){

    }
    public static void main(String[] args) throws NoSuchMethodException {
        Class c = Test12.class;
        // 调用方法
        Method method = c.getMethod("sell");
        // 进行判断
        if(method.isAnnotationPresent(Book.class)){
            // 生成对象
            Book book = method.getAnnotation(Book.class);
            // 打印
            System.out.println(book);
        }
    }
}
