package com.ming10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 字节流进行复制
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Pictures\\20191225111.png");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Pictures\\20191225113.png");
        // 进行复制
        long start = System.currentTimeMillis();
        int len = 0;
        while((len = fileInputStream.read()) != -1){
            // 进行循环读取
            fileOutputStream.write(len);
        }

        long end = System.currentTimeMillis();
        // 输出结果
        System.out.println("复制完成");
        // 进行统计
        System.out.println("时间为 "  + (end - start));
    }
}
