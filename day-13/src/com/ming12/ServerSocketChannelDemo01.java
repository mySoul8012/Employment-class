package com.ming12;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo01 {
    public static void main(String[] args){
        // 开启服务器通道
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            // 绑定本地端口号
            serverSocketChannel.bind(new InetSocketAddress(8888));
            serverSocketChannel.configureBlocking(false);
            // 进行循环
            while(true){
                // 进行阻塞
                SocketChannel socketChannel = serverSocketChannel.accept();
                // 进行判断
                if(socketChannel != null){
                    // 此时没有客户端连接
                    System.out.println("此时有客户端连接");
                    // 创建缓冲区
                    ByteBuffer byteBuffer =ByteBuffer.allocate(1024);
                    // 进行数据发送
                    socketChannel.read(byteBuffer);
                    // 更改为读模式
                    byteBuffer.flip();
                    // 进行数据读取
                    System.out.println("进行数据读取 " + new String(byteBuffer.array(), 0, byteBuffer.limit()));
                    // 进行数据写入
                    byte[] byteBuffer1 = "你好哈".getBytes();
                    ByteBuffer byteBuffer2 = ByteBuffer.wrap(byteBuffer1);
                    //进行数据写入
                    socketChannel.write(byteBuffer);
                    // 释放资源
                    socketChannel.close();
                    serverSocketChannel.close();

                }else{
                    // 此时有客户端连接
                    System.out.println("此时有客户端连接");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
