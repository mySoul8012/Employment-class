package com.ming5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 利用字节输入流读取 F盘的a.txt文件，
public class Test05 {
    public static void main(String[] args) throws IOException {
        // 创建文件输入流
        // 创建文件输入流
        FileInputStream fileOutputStream = new FileInputStream("C:\\ming\\ming.txt");
        // 进行循环读取
        int len = -1;
        // 进行循环读取
        while((len = fileOutputStream.read()) != -1){
            // 进行输出
            System.out.println((char)len);
        }
    }
}
