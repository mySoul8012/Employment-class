package com.ming12;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannelDemo02 {
    public static void main(String[] args){
        // 进行无限循环
        while(true){
            // 创建客户端通道
            try {
                SocketChannel socketChannel = SocketChannel.open();
                // 进行服务器连接
                socketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
                // 进行数据读取
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                // 进行数据读取
                socketChannel.read(byteBuffer);
                // 更改模式
                byteBuffer.flip();
                // 进行数据输出
                System.out.println(new String(byteBuffer.array(), 0, byteBuffer.limit()));
                // 创建发送集合
                byte[] bytes = "你好哈".getBytes();
                // 进行数据写入
                ByteBuffer byteBuffer1 = ByteBuffer.wrap(bytes);
                // 进行数据写入
                socketChannel.write(byteBuffer1);
                // 进行资源释放
                socketChannel.close();
                break;
            } catch (IOException e) {
                // 出现错误进行循环
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                e.printStackTrace();
            }
        }
    }
}
