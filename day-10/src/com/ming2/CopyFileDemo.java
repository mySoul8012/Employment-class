package com.ming2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 复制图片
public class CopyFileDemo {
    // 一次写入一个字节
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Pictures\\20191225111311593.png");
        // 创建输出流
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Pictures\\2019122511131159.png");
        // 进行复制
        // 保存暂时保存的
        // 时间检测
        long start = System.currentTimeMillis();
        System.out.println(start);
        int b = 0;
        while(!((b =fileInputStream.read())==-1)){
            // 进行复制操作
            fileOutputStream.write(b);
        }

        long end = System.currentTimeMillis();
        System.out.println(end);
        // 进行时间计算
        System.out.println(end - start);

        System.out.println("复制操作结束");
    }
}
