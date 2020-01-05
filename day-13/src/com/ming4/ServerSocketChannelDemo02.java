package com.ming4;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo02 {
    public static void main(String[] args) throws IOException {
        // 开启服务器通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定本地端口号
        serverSocketChannel.bind(new InetSocketAddress(8888));
        // 接收客户端通道
        // 发生阻塞
        SocketChannel socketChannel = serverSocketChannel.accept();
        // 通知有客户端连接了
        System.out.println("有客户端连接了");
    }
}
