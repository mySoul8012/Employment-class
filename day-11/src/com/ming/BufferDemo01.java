package com.ming;

import java.io.*;
import java.nio.Buffer;

public class BufferDemo01 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        copy();
        long end = System.currentTimeMillis();
        // 进行输出
        System.out.println("耗时 " + (end - start) + "毫秒");
    }

    private static void copy() throws IOException {
        // 创建缓冲流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\config.properties"));
        // 创建输出缓冲流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\1.properties"));
        // 进行文件复制
        int tmp = 0;
        while((tmp = bufferedInputStream.read()) != -1){
            bufferedOutputStream.write(tmp);
        }
        // 资源释放
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
