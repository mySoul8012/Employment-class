package com.ming11;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class SocketChannelDemo01 {
    public static void main(String[] args){
        while(true){
            // 开启客户端通道
            try {
                SocketChannel socketChannel = SocketChannel.open();
                // 连接服务器
                socketChannel.connect(new InetSocketAddress("127.0.0.1", 8888));
                // 进行发送数据
                byte[] bytes = "你好发送数据".getBytes();
                // 进行数据发送
                ByteBuffer buffer = ByteBuffer.wrap(bytes);
                // 进行通道写入
                socketChannel.write(buffer);
                // 接收数据
                ByteBuffer buffer1 = ByteBuffer.allocate(100);
                // 进行数据写入
                socketChannel.read(buffer1);
                // 切换成读模式
                buffer1.flip();
                //进行输出
                System.out.println("客户端说 " + new String(buffer1.array(), 0, buffer1.limit()));
                // 进行资源释放
                socketChannel.close();
                // 进行返回
                break;
                // 进行数据
            } catch (IOException e) {
                // 进行睡眠
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                e.printStackTrace();
            }
        }
    }
}
