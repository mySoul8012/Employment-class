package com.ming4;

import java.io.*;

public class Test04 {
    public static void main(String[] args) throws IOException {
        // 创建读入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("2.txt"));
        // 创建读出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("3.txt"));
        // 进行文件读取
        // 定义长度
        int len = 0;
        // 定义字节数组
        byte[] bytes = new byte[1024 * 2];
        // 进行文件复制
        while((len = bufferedInputStream.read(bytes)) != -1){
            // 进行文件复制
            bufferedOutputStream.write(bytes);
        }
        // 输出结束复制
        System.out.println("复制结束");
    }
}
