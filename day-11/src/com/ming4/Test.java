package com.ming4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建空的 Properties
        Properties properties = new Properties();
        // 进行数据装载
        properties.load(new InputStreamReader(new FileInputStream("C:\\ming\\ming.txt"), "UTF-8"));
        // 进行集合遍历
        Set<String> stringSet = properties.stringPropertyNames();
        // 进行集合遍历
        for(String string:stringSet){
            // 进行输出
            System.out.println(properties.get(string) + " = " + string);
        }
    }
}
