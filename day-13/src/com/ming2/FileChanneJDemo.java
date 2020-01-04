package com.ming2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChanneJDemo {

    public static void main(String[] args) throws IOException {
        // 创建2个流
        FileInputStream fileInputStream = new FileInputStream("2.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("copt.txt");
        // 获取通道
        FileChannel fileChannel = fileInputStream.getChannel();
        FileChannel fileChannel1 = fileOutputStream.getChannel();
        // 进行文件复制
        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 创建结束标识
        int eof = 0;
        // 进行复制操作
        while((eof = fileChannel.read(byteBuffer)) != -1){
            // 切换成读模式
            byteBuffer.flip();  // 切换成读模式
            // 进行写
            fileChannel1.write(byteBuffer);
            // 进行清空
            byteBuffer.clear();
        }
        // 进行关闭
        fileChannel.close();
        fileChannel1.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
