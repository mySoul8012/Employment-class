package com.ming15;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

public class AIODemo02 {
    public static void main(String[] args) throws IOException {
        // 创建异步服务器通道
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        // 绑定端口
        asynchronousServerSocketChannel.bind(new InetSocketAddress(8888));
        // 接收客户端
        asynchronousServerSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel asynchronousSocketChannel, Object o) {
                System.out.println("连接成功");
            }

            @Override
            public void failed(Throwable throwable, Object o) {
                System.out.println("连接失败....");
            }
        });
        System.out.println("程序继续执行");
    }
}
