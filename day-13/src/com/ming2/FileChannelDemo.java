package com.ming2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class FileChannelDemo {
    public static void main(String[] args) throws IOException {
        // 创建流
        FileInputStream fileInputStream = new FileInputStream("Readme.md");
        FileOutputStream fileOutputStream = new FileOutputStream("copy.md");
        // 获取通道
        FileChannel fileChannel = fileInputStream.getChannel();
        FileChannel fileChannel1 = fileOutputStream.getChannel();
        // 复制文件
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int eof = 0;
        // 进行读
        while((eof = fileChannel.read(buffer)) != -1){
            // 切换成读模式
            buffer.flip();  // 指针指向为 0， limit 为 1024
            // 开始写
            fileChannel1.write(buffer);
            // 清空
            buffer.clear();
        }
        // 进行close
        fileChannel.close();
        fileChannel1.close();

    }
}
