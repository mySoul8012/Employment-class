package com.ming3;

import java.io.*;

public class FileReaderDemo01 {
    public static void main(String[] args) throws IOException {
        // 创建字符流
        // 创建文件
        File file = new File("C:\\Users\\Administrator\\Pictures\\20191225111311593.png");
        // 创建字符输入流
        Reader fileReader = new FileReader(file);
        // 读取字符
        int res = fileReader.read();
        System.out.println(res);

        System.out.println(file.length());

        fileReader.close();


    }
}
