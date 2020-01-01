package com.ming5;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 定义字符串
        String name = "我爱Java";
        // 对文件进行写入
        FileOutputStream fileOutputStream = new FileOutputStream("333.txt");
        // 对文件进行格式转换
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
        // 进行文件输入
        outputStreamWriter.write(name);
        // 关闭流
        outputStreamWriter.close();
        fileOutputStream.close();
    }
}
