package com.ming7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 创建集合
        List<Integer> list = new ArrayList<>();
        // 进行数据添加
        list.add(111);
        list.add(222);
        list.add(333);
        // 获取对象
        Class c = list.getClass();
        // 获取add方法
        Method method = c.getMethod("add", Object.class);
        // 进行数据添加
        method.invoke(list, "222");
        // 输出集合
        for(int i = 0; i < list.size(); i ++){
            // 进行打印
            System.out.println(list.get(i));
        }
    }
}
