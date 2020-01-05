package com.ming14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 使用 FileChannel结合MappedByteBuffer 实现 2G以下文件的复制
        // 创建文件对象
        RandomAccessFile randomAccessFile = new RandomAccessFile("1.png", "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("copy.png", "rw");
        // 获取通道
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileChannel fileChannel1 = randomAccessFile1.getChannel();
        // 映射缓冲区
        long size = fileChannel.size();
        // 进行映射
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
        MappedByteBuffer mappedByteBuffer1 = fileChannel1.map(FileChannel.MapMode.READ_WRITE, 0, size);
        // 进行文件复制
        for(int i = 0; i < size; i++){
            // 进行文件复制
            byte bytes = mappedByteBuffer.get(i);
            //进行文件复制
            mappedByteBuffer1.put(i, bytes);
        }
        // 关闭
        fileChannel.close();
        fileChannel1.close();
        randomAccessFile.close();
        randomAccessFile1.close();
    }
}
