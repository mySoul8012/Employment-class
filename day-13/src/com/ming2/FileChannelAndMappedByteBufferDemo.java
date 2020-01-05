package com.ming2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.RandomAccess;

public class FileChannelAndMappedByteBufferDemo {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        RandomAccessFile randomAccessFile = new RandomAccessFile("1.png", "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("copy.png", "rw");
        // 获取通道
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileChannel fileChannel1 = randomAccessFile1.getChannel();
        // 映射缓冲区
        long size = fileChannel.size();
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
        MappedByteBuffer mappedByteBuffer1 = fileChannel1.map(FileChannel.MapMode.READ_WRITE, 0, size);
        // 进行复制
        for(int i = 0; i < size; i ++){
            // 进行读取复制
            byte b = mappedByteBuffer.get(i);
            // 进行字节添加
            mappedByteBuffer1.put(i, b);
        }
        // 进行资源释放
        randomAccessFile.close();
        randomAccessFile1.close();
        fileChannel.close();
        fileChannel1.close();
    }
}
