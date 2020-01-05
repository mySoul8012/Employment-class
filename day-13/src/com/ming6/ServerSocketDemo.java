package com.ming6;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        // 创建通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定本地端口号
        serverSocketChannel.bind(new InetSocketAddress(8888));
        // 接收客户端通道
        // 开启NIO的同步非阻塞功能
        serverSocketChannel.configureBlocking(false);
        // 进行无限循环
        while(true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            // 进行判断
            if(socketChannel != null){
                // 此时有客户端来了
                System.out.println("有客户端来了");
                break;
            }else{
                // 此时无客户端，进行打印
                System.out.println("暂时无客户端连接，等待3秒");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
