package com.ming11;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException, InvocationTargetException {
        // 创建 Properties 格式的配置文件，
        InputStream inputStream = new FileInputStream(new File("2.properties"));
        // 创建Properoties类
        Properties properties = new Properties();
        // 装载配置文件
        properties.load(inputStream);
        // 获取类的完整名称
        Set<String> stringSet = properties.stringPropertyNames();
        // 进行遍历
        for (String s : stringSet) {
            // 进行遍历
            Class clazz = Class.forName(properties.get(s) + "");
            // 生成对象
            Constructor constructor = clazz.getConstructor();
            DemoClass demoClass = (DemoClass) clazz.newInstance();
            // 获取方法
            Method method = clazz.getMethod("run");
            // 进行调用
            method.invoke(demoClass);

        }
    }
}
