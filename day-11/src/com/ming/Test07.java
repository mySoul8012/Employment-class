package com.ming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class Test07 {
    public static void main(String[] args) throws IOException {
        // 创建持久化属性集
        Properties properties = new Properties();
        // 进行添加
        properties.setProperty("xiaoming", "xiaomingming");
        properties.setProperty("mingdd", "mingxiao");
        properties.setProperty("mingee", "mingeee");
        // 创建字符流
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\config.properties");
        // 进行持久化保存
        properties.store(fileOutputStream, "xiaoming");
        // 进行关闭
        fileOutputStream.close();
    }
}
