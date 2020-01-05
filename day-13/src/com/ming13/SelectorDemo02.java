package com.ming13;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class SelectorDemo02 {
    public static void main(String[] args){
        // 创建线程
        new Thread(() -> {
            while(true){
                try {
                    SocketChannel socketChannel = SocketChannel.open();
                    // 进行连接
                    socketChannel.connect(new InetSocketAddress("localhost", 7777));

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
