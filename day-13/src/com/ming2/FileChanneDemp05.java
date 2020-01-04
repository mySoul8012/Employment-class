package com.ming2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChanneDemp05 {
    public static void main(String[] args) throws IOException {
        // 创建两个流
        FileInputStream fileInputStream = new FileInputStream("1.png");
        FileOutputStream fileOutputStream = new FileOutputStream("copy.png");
        // 创建通道
        FileChannel fileChannel = fileInputStream.getChannel();
        FileChannel fileChannel1 = fileOutputStream.getChannel();
        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 进行复制
        // 创建结束标记
        int eof = 0;
        // 进行复制
        while((eof = fileChannel.read(byteBuffer)) != -1){
            // 转换成读模式
            byteBuffer.flip();
            //进行复制操作
            fileChannel1.write(byteBuffer);
            // 进行清空
            byteBuffer.clear();
        }
        // 进行关闭
        fileInputStream.close();
        fileOutputStream.close();
        fileChannel.close();
        fileChannel1.close();
    }
}
