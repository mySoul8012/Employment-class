package com.ming3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.RandomAccess;

public class FileChannelAndMappedByteBufferDemo {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\ming\\ming.txt", "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("copy.png", "rw");
        // 获取通道
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileChannel fileChannel1 = randomAccessFile1.getChannel();
        // 映射缓冲区
        long size = fileChannel.size();
        // 切换成只读模式
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
        // 切换成读写镜像
        MappedByteBuffer mappedByteBuffer1 = fileChannel1.map(FileChannel.MapMode.READ_WRITE, 0, size);
        // 进行复制操作
        for(int i = 0; i < size; i++){
            // 进行读取
            byte b = mappedByteBuffer.get(i);
            // 进行添加
            mappedByteBuffer1.put(i, b);
        }
        // 进行资源释放
        fileChannel.close();
        fileChannel1.close();

    }
}
