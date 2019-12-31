package com.ming;

import java.util.Properties;
import java.util.Set;

public class Test04 {
    public static void main(String[] args){
        // 创建持久属性集
        Properties properties = new Properties();
        // 进行打印
        System.out.println(properties);
        // 添加数据
        properties.setProperty("xiao", "343");
        properties.setProperty("xming", "43");
        properties.setProperty("mingnim", "2323");
        // 进行遍历
        Set<String> propertyNames = properties.stringPropertyNames();
        // 打印
        System.out.println(properties);
        // 进行循环
        for(String propertyName: propertyNames){
            // 进行打印
            String propertyValue = (String)properties.get(propertyName);
            // 进行打印
            System.out.println(propertyName + "  " + propertyValue);
        }
    }
}
