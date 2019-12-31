package com.ming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test08 {
    public static void main(String[] args) throws IOException {
        // 创建持久属性集
        Properties properties = new Properties();
        // 进行添加数据
        properties.setProperty("ming", "mingming");
        properties.setProperty("xiaoming", "xiaomingm");
        properties.setProperty("xianh", "mingxx");
        // 创建文件输出流
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\config.properties", true);
        // 进行持久化
        properties.store(fileOutputStream, "xiaoming");
        // 进行关闭
        fileOutputStream.close();
    }
}
