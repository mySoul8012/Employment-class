package com.ming2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelAndMappedByteBufferDemo08 {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        RandomAccessFile randomAccessFile = new RandomAccessFile("1.png", "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("2.png", "rw");
        // 创建通道
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileChannel fileChannel1 = randomAccessFile1.getChannel();
        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 创建结束符
        int eof = 0;
        // 进行文件读取
        while((eof = fileChannel.read(byteBuffer)) != -1){
            // 进行文件读取
            fileChannel1.write(byteBuffer);
        }
        // 进行文件关闭
        fileChannel.close();
        fileChannel1.close();
    }
}
