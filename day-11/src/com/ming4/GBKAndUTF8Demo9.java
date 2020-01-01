package com.ming4;

import java.io.*;

public class GBKAndUTF8Demo9 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("22.txt"), "UTF-8");
        OutputStreamWriter outputStreamWriter1 = new OutputStreamWriter(new FileOutputStream("222.txt"), "GBK");
        // 进行写数据
        outputStreamWriter.write("你好");
        outputStreamWriter1.write("你好");
        // 释放资源
        outputStreamWriter.close();
        outputStreamWriter1.close();
    }
}
