package com.ming7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 添加数据
        List<Integer> list = new ArrayList<>();
        // 添加数据
        list.add(2222);
        list.add(4444);
        list.add(5555);
        // 获取class
        Class clazz = list.getClass();
        // 获取方法
        Method method = clazz.getMethod("add", Object.class);
        // 进行数据添加
        method.invoke(list, 333);
        // 进行打印
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
