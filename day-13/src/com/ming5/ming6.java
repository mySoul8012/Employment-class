package com.ming5;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class ming6 {
    public static void main(String[] args) throws IOException {
        // 开启客户端通道
        SocketChannel socketChannel = SocketChannel.open();
        // 连接服务器
        socketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
        // 进行打印，连接成功
        socketChannel.close();
    }
}
