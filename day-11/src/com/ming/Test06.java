package com.ming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

// 对 properties 进行持久化
public class Test06 {
    public static void main(String[] args) throws IOException {
        // 进行持久化保存
        Properties properties = new Properties();
        // 进行数据添加
        properties.setProperty("xiaoming", "mingming");
        properties.setProperty("mingxiaodf", "ming");
        // 创建字节流
        FileOutputStream  fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\config.properties");
        // 进行数据装载
        properties.store(fileOutputStream, "xiaoxiao");
        // 进行流关闭
        fileOutputStream.close();
    }

}
