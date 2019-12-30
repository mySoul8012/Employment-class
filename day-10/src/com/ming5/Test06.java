package com.ming5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 利用字节输入流进行循环读取
public class Test06 {
    public static void main(String[] args) throws IOException {
        // 利用字节输入流进行循环读取
        FileInputStream fileInputStream = new FileInputStream("C:\\ming\\ming.txt");
        // 读取字节数组，直到末尾
        int lenth = 0;
        byte[] bytes = new byte[1024 * 10];
        while((lenth = fileInputStream.read(bytes)) != -1){
            // 进行输出
            System.out.println(new String(bytes));
        }
    }
}
