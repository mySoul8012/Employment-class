package com.ming18;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestDemo01 {
    public static void main(String[] args){
        // 创建动态代理
        SchoolService schoolService = (SchoolService) Proxy.newProxyInstance(
                TestDemo.class.getClassLoader(), new Class[]{SchoolService.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        // 创建启动时间
                        long start = System.currentTimeMillis();
                        // 调用方法
                        Object res = method.invoke(o, args);
                        // 再次启动调用
                        long end = System.currentTimeMillis();
                        // 输出结果
                        System.out.println("执行的时间为 " + (end - start));
                        // 返回结果
                        return res;
                    }
                }
        );
        // 调用动态代理对象的方法
        String allclazzs = schoolService.getAllClazzs();
        // 进行输出
        System.out.println(allclazzs);
    }
}
