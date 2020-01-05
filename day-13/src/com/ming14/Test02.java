package com.ming14;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

// 使用 SocketChannel ServerSocketChannel
// 进行同步
public class Test02 {
    public static void main(String[] args){
        // 使用ServerSocketChannel
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(8888));
            // 开启同步非阻塞
            serverSocketChannel.configureBlocking(false);
            // 进行配置
            while(true) {
                SocketChannel socketChannel = serverSocketChannel.accept();
                // 进行配置
                // 进行判断
                if (socketChannel != null) {
                    // 如果不为空，连接成功
                    System.out.println("此时连接成功");
                    break;
                } else {
                    // 如果为空，此时连接失败，进行重试
                    // 如果为空此时连接失败，进行重试
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
