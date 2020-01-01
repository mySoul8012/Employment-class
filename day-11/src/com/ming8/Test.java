package com.ming8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        // 进行复制
        properties.setProperty("mingming", "mingming");
        properties.setProperty("xiao", "xiaoxiao");
        // 进行文件写入
        FileOutputStream fileOutputStream = new FileOutputStream("333.properties");
        // 进行文件写入
        properties.store(fileOutputStream, "xiaoxiao");
        // 关闭
        fileOutputStream.close();
    }
}
