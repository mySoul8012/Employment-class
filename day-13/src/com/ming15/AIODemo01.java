package com.ming15;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class AIODemo01 {
    public static void main(String[] args){
        // 创建异步客户端通道
        try {
            // 异步客户端通道
            AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open();
            // 连接服务器
            asynchronousSocketChannel.connect(new InetSocketAddress("127.0.0.1", 8888), null, new CompletionHandler<Void, Object>() {
                @Override
                public void completed(Void aVoid, Object o) {
                    System.out.println("连接成功");
                }

                @Override
                public void failed(Throwable throwable, Object o) {
                    System.out.println("连接失败");
                }
            });
            System.out.println("程序继续");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
