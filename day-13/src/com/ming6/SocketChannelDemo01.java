package com.ming6;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class SocketChannelDemo01 {
    public static void main(String[] args){
        // 创建无限循环
        while(true){
            try {
                // 开启客户端通道
                SocketChannel socketChannel = SocketChannel.open();
                // 连接服务器
                socketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
                // 显示连接成功
                System.out.println("连接成功");
                // 退出无限循环
                break;
            }catch (IOException e){
                // 此时失败,进行三秒后重尝试
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                // 重试完成，打印结果
                System.out.println("3秒钟重试完成，进行再次尝试连接");
            }
        }
    }
}
