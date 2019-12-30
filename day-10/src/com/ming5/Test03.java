package com.ming5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 利用字节输出流，一次写一个字节的方式，D盘输出字符a
public class Test03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\ming\\ming.txt");
        // 输出字符串 a
        for(int i = 0; i < 10; i++){
            // 进行输出
            fileOutputStream.write(i);
        }
    }
}
