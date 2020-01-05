package com.ming8;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 开启服务器通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        // 绑定本地端口号
        serverSocketChannel.bind(new InetSocketAddress(8888));
        // 客户端通道开启false
        serverSocketChannel.configureBlocking(false);
        // 进行无限循环
        while(true){
            // 进行阻塞
            SocketChannel socketChannel = serverSocketChannel.accept();
            // 进行判断
            if(socketChannel != null){
                // 进行打印
                System.out.println("此时有客户端来了");
                // 接收客户端数据
                ByteBuffer byteBuffer = ByteBuffer.allocate(100);
                // 进行读取
                socketChannel.read(byteBuffer);
                // 改成读模式
                byteBuffer.flip();
                // 进行打印
                System.out.println(new String(byteBuffer.array(), 0, byteBuffer.limit()));
                // 进行回复数据
                byte[] bytes = "你好，我是NIO服务器".getBytes();
                // 进行打印
                ByteBuffer buffer = ByteBuffer.wrap(bytes);
                // 进行写
                socketChannel.write(buffer);
                // 进行资源释放
                socketChannel.close();
                serverSocketChannel.close();
                break;

            }else{
                // 此时有客户端来了
                System.out.println("此时无客户端 等待3秒");
                Thread.sleep(3000);
            }
        }
    }
}
