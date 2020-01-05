package com.ming11;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketChannelDemo01 {
    public static void main(String[] args){
        // 开启服务器通道
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            // 进行绑定本地端口号
            serverSocketChannel.bind(new InetSocketAddress(8888));
            // 接收客户端
            // 开启 NIO 的同步非阻塞功能
            serverSocketChannel.configureBlocking(false);
            // 进行无限循环
            while(true){
                // 进行阻塞
                SocketChannel socketChannel = serverSocketChannel.accept();
                // 进行判断
                if(socketChannel != null){
                    // 如果不为空，进行判断输出，有客户端来了
                    System.out.println("此时有客户端来了");
                    // 进行接收客户端发送的数据
                    ByteBuffer byteBuffer = ByteBuffer.allocate(100);
                    // 进行数据读入
                    socketChannel.read(byteBuffer);
                    // 切换成为读模式
                    byteBuffer.flip();
                    // 进行数据输出
                    System.out.println("客户端说 " + new String(byteBuffer.array(), 0, byteBuffer.limit()) );
                    // 进行返回数据
                    byte[] bytes = "你好，我这边回复数据".getBytes();
                    // 进行数据写入
                    ByteBuffer byteBuffer1 = ByteBuffer.wrap(bytes);
                    // 进行数据写入
                    socketChannel.write(byteBuffer);
                    // 进行资源释放
                    socketChannel.close();
                    // 进行服务器资源释放
                    serverSocketChannel.close();
                    // 进行返回
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // 发生异常，，进行客户端循环
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
