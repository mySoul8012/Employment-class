package com.ming10;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class SocketChannelDemo01 {
    public static void main(String[] args){
        // 开启客户端通道
        try {
            SocketChannel socketChannel = SocketChannel.open();
            // 进行连接服务器
            socketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
