package com.ming8;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 创建输入流
        FileInputStream fileInputStream = new FileInputStream("333.properties");
        // 进行数据装在
        properties.load(fileInputStream);
        // 获取键
        Set<String> stringSet = properties.stringPropertyNames();
        // 进行读取
        for(String str:stringSet){
            // 进行打印
            System.out.println(str + " = " + properties.get(str));
        }
        // 关闭流
        fileInputStream.close();
    }
}
