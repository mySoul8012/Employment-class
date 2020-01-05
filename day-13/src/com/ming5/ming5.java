package com.ming5;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ming5 {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定本地端口
        serverSocketChannel.bind(new InetSocketAddress("127.0.0.1", 8888));
        // 接收客户端通道
        serverSocketChannel.accept();
        // 进行打印连接成功
        System.out.println("连接成功");

    }
}
