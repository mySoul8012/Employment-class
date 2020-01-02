package com.ming2;

import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCpClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建客户端
        Socket socket = new Socket("127.0.0.1", 54321);
        // 进行服务器连接
        System.out.println("服务器连接成功");
        // 获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        // 调用 out 的 write 方法
        Thread.sleep(5000);
        // 进行数据库发送
        outputStream.write("你好，服务器，我是客户端，进行数据发送".getBytes());
        // 进行数据发送
        System.out.println("数据发送成功");
        // 进行资源释放
        outputStream.close();
        socket.close();
        // 进行关闭
        System.out.println("客户端关闭成功");
    }
}
