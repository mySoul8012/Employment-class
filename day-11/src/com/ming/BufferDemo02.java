package com.ming;

import java.io.*;
import java.nio.Buffer;

public class BufferDemo02 {
    public static void main(String[] args) throws IOException {
       copy();
    }

    public static void  copy() throws IOException {
        // 创建输入缓冲流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\config.properties"));
        // 创建输出缓冲流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\111.properties"));
        // 进行复制
        int tmp = 0;
        // 进行复制
        while((tmp = bufferedInputStream.read()) != -1){
            // 进行复制
            bufferedOutputStream.write(tmp);
        }
        // 输出复制完成
        // 关闭资源
        bufferedInputStream.close();
        bufferedOutputStream.close();
        System.out.println("复制完成");
    }
}
