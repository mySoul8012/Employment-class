package com.ming7;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class SocketChaeelDemo01 {
    public static void main(String[] args){
        while(true){
            // 开启客户端通道
            try {
                SocketChannel channel = SocketChannel.open();
                // 进行连接
                channel.connect(new InetSocketAddress("127.0.0.1", 8888));
                // 进行输出连接成功
                System.out.println("此时连接成功");
                // 退出循环
                break;
            } catch (IOException e) {
                e.printStackTrace();
                // 此时连接失败，进行重试
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }
}
