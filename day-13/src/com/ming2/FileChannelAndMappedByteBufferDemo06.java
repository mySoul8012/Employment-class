package com.ming2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelAndMappedByteBufferDemo06 {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        RandomAccessFile randomAccessFile = new  RandomAccessFile("1.png", "r");
        RandomAccessFile randomAccessFile1 = new RandomAccessFile("3.png", "rw");
        // 获取通道
        FileChannel fileChannel = randomAccessFile.getChannel();
        FileChannel fileChannel1 = randomAccessFile1.getChannel();
        // 创建结束符号
        int eof = 0;
        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 进行文件复制
        while((eof = fileChannel.read(byteBuffer)) != -1){
            // 进行文件复制
            // 切换成读模式
            byteBuffer.flip();
            // 进行文件复制
            fileChannel1.write(byteBuffer);
            // 进行清理
            byteBuffer.clear();
        }
        // 进行关闭
        fileChannel.close();
        fileChannel1.close();

    }

}
