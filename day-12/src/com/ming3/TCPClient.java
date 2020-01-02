package com.ming3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建客户端，连接服务器
        Socket socket = new Socket("127.0.0.1", 54321);
        // 进行服务器连接
        System.out.println("服务器连接成功....");
        // 获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        // 调用 out 的writer方法
        Thread.sleep(5000);
        // 进行数据输出
        outputStream.write("你好服务器，我来了".getBytes());
        // 进行数据发送
        System.out.println("数据发送成功");
        // 获取通道中的输入流
        InputStream inputStream = socket.getInputStream();
        // 调用 in 的read方法
        System.out.println("等待服务器回信");
        byte[] bytes = new byte[1024];
        // 进行阻塞
        int len = inputStream.read(bytes);
        // 进行输出输出
        System.out.println("服务器说" + new String(bytes, 0, len));
        // 进行资源释放
        inputStream.close();
    }
}
