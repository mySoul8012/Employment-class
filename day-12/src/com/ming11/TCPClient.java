package com.ming11;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

// 创建客户端
public class TCPClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建客户端
        Socket socket = new Socket("127.0.0.1", 54321);
        // 进行服务器连接
        System.out.println("服务器连接成功...");
        // 获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        // 调用 out write 方法
        Thread.sleep(5000);
        // 进行数据输出
        outputStream.write("你好，，我来了".getBytes());
        // 进行数据发送
        System.out.println("数据进行发送");
        // 进行资源释放
        outputStream.close();
        socket.close();
        System.out.println("客户端关闭成功");
    }
}
