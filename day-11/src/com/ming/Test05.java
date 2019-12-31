package com.ming;

import java.util.Properties;
import java.util.Set;

public class Test05 {
    public static void main(String[] args){
        Properties properties = new Properties();
        // 添加数据
        properties.setProperty("xiaoming", "xiao");
        properties.setProperty("xiaomingming", "nming");
        properties.setProperty("siao", "ming");
        // 进行循环遍历
        Set<String> propertiesNames = properties.stringPropertyNames();
        // 进行遍历
        for(String propertiesName:propertiesNames){
            // 进行遍历
            String propertiesVlaue = (String)properties.get(propertiesName);
            // 进行输出
            System.out.println(propertiesName + "  "  + propertiesVlaue);
        }
    }
}
