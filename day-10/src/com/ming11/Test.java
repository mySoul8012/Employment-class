package com.ming11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 使用字节流 一次读取一个k字节的数组
public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Pictures\\2019122511131159.png");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Pictures\\342950902.txt");
        // 创建数组
        int len = 0;
        byte[] bytes = new byte[1024];
        // 进行读取
        while((len= fileInputStream.read(bytes)) != -1){
            // 如果不为-1 进行读取复制
            fileOutputStream.write(bytes, 0, len);
        }
        System.out.println("复制完成");
    }
}
