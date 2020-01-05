package com.ming13;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class SelectorDemo01 {
    public static void main(String[] args){
        // 创建三个服务器通道
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.bind(new InetSocketAddress(7777));
            ServerSocketChannel serverSocketChannel1 = ServerSocketChannel.open();
            serverSocketChannel1.configureBlocking(false);
            serverSocketChannel1.bind(new InetSocketAddress(9999));
            ServerSocketChannel serverSocketChannel2 = ServerSocketChannel.open();
            serverSocketChannel2.configureBlocking(false);
            serverSocketChannel2.bind(new InetSocketAddress(1223));
            // 创建多路复用器
            Selector selector = Selector.open();
            // 进行注册
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            serverSocketChannel1.register(selector, SelectionKey.OP_ACCEPT);
            serverSocketChannel2.register(selector, SelectionKey.OP_ACCEPT);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
