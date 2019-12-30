package com.ming5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 利用字节输出流，一次写一个字节数组，向D盘输出内容
public class Test04 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\ming\\ming.txt");
        // 进行输出
        // 获取字节数组
        byte[] bytes = "i love java".getBytes();
        // 进行输出
        fileOutputStream.write(bytes);
        // 文件输出完成
        System.out.println("文件输出完成");
    }
}
