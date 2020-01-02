package com.ming13;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建客户端
        Socket socket = new Socket("127.0.0.1", 54321);
        // 进行输出
        System.out.println("服务连接成功...");
        // 获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        // 进行停止
        Thread.sleep(5000);
        // 进行写入
        outputStream.write("你好，，我来了".getBytes());
        // 进行输出
        System.out.println("数据输出成功");
        // 进行资源释放
        outputStream.close();
        socket.close();
        System.out.println("客户端关闭成功");
    }
}
