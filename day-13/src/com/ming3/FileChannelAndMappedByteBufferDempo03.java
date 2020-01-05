package com.ming3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelAndMappedByteBufferDempo03 {
    public static void main(String[] args) throws IOException {
        // 创建文件
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\ming\\ming.txt", "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("copy.txt", "rw");
        // 创建通道
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileChannel fileChannel1 = randomAccessFile1.getChannel();
        // 获取大小
        long size = fileChannel.size();
        // 创建映射区
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY,0, size);
        MappedByteBuffer mappedByteBuffer1 = fileChannel1.map(FileChannel.MapMode.READ_WRITE, 0, size);
        // 进行复制
        for(int i = 0; i < size; i++){
            // 进行复制操作
            // 读取字节
            byte byte1 = mappedByteBuffer.get(i);
            // 进行复制
            mappedByteBuffer1.put(i, byte1);
        }
        // 进行关闭
        fileChannel.close();
        fileChannel1.close();
    }
}
