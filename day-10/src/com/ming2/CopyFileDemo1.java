package com.ming2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 复制一个数组
public class CopyFileDemo1 {
    public static void main(String[] args) throws IOException {
        // 进行数组复制 这里使用数组进行复制
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Pictures\\20191225111311593.png");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Pictures\\20191225111.png");
        // 这里使用数组复制
        byte[] bytes = new byte[1024 * 10];
        // 复制的长度
        int len = 0;
        while((len = fileInputStream.read(bytes))!= -1){
            // 如果长度不为0进行复制
            fileOutputStream.write(bytes, 0, len);
        }

        // 输出
        System.out.println("复制结束");
    }
}
