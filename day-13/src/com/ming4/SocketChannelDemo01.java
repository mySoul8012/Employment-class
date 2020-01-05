package com.ming4;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class SocketChannelDemo01 {
    public static void main(String[] args) throws IOException {
        // 开启客户端通道
        SocketChannel channel = SocketChannel.open();
        // 连接服务器
        channel.connect(new InetSocketAddress("127.0.0.1", 8888));
    }
}
