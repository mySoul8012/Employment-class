package com.ming2;

import java.io.File;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        // 创建文件
        File file = new File("C:\\Users\\Administrator\\Pictures\\20191225111.png");
        // 创建输入流
        java.io.FileWriter fileWriter = new java.io.FileWriter(file);
        // 进行文件写入
        fileWriter.write(2);
        // 关闭
        fileWriter.close();
    }
}
