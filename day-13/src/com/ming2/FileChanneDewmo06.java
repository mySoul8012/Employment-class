package com.ming2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

// 进行文件复制
public class FileChanneDewmo06 {
    public static void main(String[] args) throws IOException {
        // 进行文件复制
        // 创建输入输出流
        FileInputStream inputStream = new FileInputStream("C:\\ming\\ming.txt");
        FileOutputStream outputStream = new FileOutputStream("copy.png");
        // 创建通道
        FileChannel fileChannel =  inputStream.getChannel();
        FileChannel fileChannel1 = outputStream.getChannel();
        // 获取结束符
        int eof = 0;
        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 进行文件复制
        while((eof = fileChannel.read(byteBuffer)) != -1){
            // 切换成为读模式
            byteBuffer.flip();
            // 进行文件复制
            fileChannel1.write(byteBuffer);
            // 进行清空
            byteBuffer.clear();
        }
        // 进行关闭
        fileChannel.close();
        fileChannel1.close();
        inputStream.close();
        outputStream.close();
    }
}
