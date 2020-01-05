package com.ming3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.FileNameMap;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelAndMappedByteBufferDemo02 {
    public static void main(String[] args) throws IOException {
        // 创建文件
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\ming\\2.txt", "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("2.png", "rw");
        // 获取通道
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileChannel fileChannel1 = randomAccessFile1.getChannel();
        // 获取映射
        // 设置缓冲区大小
        int size = 0;
        // 获取缓冲镜像
        MappedByteBuffer  mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
        MappedByteBuffer mappedByteBuffer1 = fileChannel1.map(FileChannel.MapMode.READ_WRITE, 0, size);
        // 进行复制
        for(int i =0; i < size; i++){
            // 进行读取
            byte b = mappedByteBuffer.get(i);
            // 进行写入
            mappedByteBuffer1.put(i, b);
        }
        // 进行关闭
        fileChannel.close();
        fileChannel1.close();
    }
}
