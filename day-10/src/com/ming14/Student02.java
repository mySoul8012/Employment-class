package com.ming14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Student02 {
    public static void main(String[] args) throws IOException {
        // 读取文件
        FileInputStream fileInputStream = new FileInputStream("C:\\ming\\ming.txt");
        // 进行文件读写
        int tmp = 0;
        // 进行读取
        while((tmp = fileInputStream.read()) != -1){
            // 进行数据输出
            System.out.print((char)tmp);
        }
    }
}
