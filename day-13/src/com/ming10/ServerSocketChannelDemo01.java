package com.ming10;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo01 {
    public static void main(String[] args){
        // 开启服务器通道
        try {
            // 开启服务器通道
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            // 绑定本地端口号
            serverSocketChannel.bind(new InetSocketAddress(8888));
            // 接收客户端通道
            SocketChannel socketChannel = serverSocketChannel.accept();
            // 进行打印，
            System.out.println("有客户端连接了...");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
