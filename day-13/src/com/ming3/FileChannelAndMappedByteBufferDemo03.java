package com.ming3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelAndMappedByteBufferDemo03 {
    public static void main(String[] args) throws IOException {
        // 进行文件复制
        RandomAccessFile randomAccessFile = new RandomAccessFile("2.pmg", "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("copy.png", "rw");
        // 创建通道
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileChannel fileChannel1 = randomAccessFile1.getChannel();
        // 创建镜像
        // 获取文件大小
        long size = fileChannel.size();
        MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, size);
        MappedByteBuffer mappedByteBuffer1 = fileChannel1.map(FileChannel.MapMode.READ_WRITE, 0, size);
        // 进行文件复制
        for(int i = 0; i < size; i++){
            // 进行文件复制
            byte tmp = mappedByteBuffer.get(i);
            mappedByteBuffer1.put(i, tmp);
        }
        // 进行关闭
        fileChannel.close();
        fileChannel1.close();
    }
}
