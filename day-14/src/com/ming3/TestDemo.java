package com.ming3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) throws NoSuchMethodException {
        Class pigclass = Pig.class;
        // 获取注解所在的具体目标
        Method method = pigclass.getMethod("eat");
        // 判断目标是否真有此注解
        boolean b = method.isAnnotationPresent(Book.class);
        // 进行选择
        if(b){
            // 进行获取对象
            Book book = method.getAnnotation(Book.class);
            // 从注解上获取其各个属性值
            System.out.println("书名 " + book.name());
            System.out.println("价格 " + book.price());
            System.out.println("页数 " + book.pages());
            System.out.println("作者们 " + Arrays.toString(book.authors()));
        }else{
            // 此方法上没有此注解
            System.out.println("该方法上没有此注解");
        }
    }
}
