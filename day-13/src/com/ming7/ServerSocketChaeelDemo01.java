package com.ming7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChaeelDemo01 {
    public static void main(String[] args) throws IOException {
        // 开启服务器通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定端口号
        serverSocketChannel.bind(new InetSocketAddress(8888));
        serverSocketChannel.configureBlocking(false);
        // 进行无限循环
        while(true){
            SocketChannel socketChannel = serverSocketChannel.accept();
            // 进行判断
            if(socketChannel != null){
                // 此时有客户端来了
                System.out.println("此时有客户端来了");
            }else{
                System.out.println("此时没有客户端来，进行重试");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
