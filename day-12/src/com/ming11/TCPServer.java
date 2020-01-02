package com.ming11;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 创建服务器
        ServerSocket serverSocket = new ServerSocket(54321);
        // 服务器启动
        System.out.println("服务器启动");
        // 等待接收客户端
        System.out.println("等待客户端");
        // 进行阻塞
        Socket socket = serverSocket.accept();
        // 进行接收
        System.out.println("客户端来了...");
        // 获取输入流
        InputStream inputStream = socket.getInputStream();
        // 调用 in 的read方法
        byte[] bytes = new byte[1024];
        // 进行输出
        System.out.println("进行接收");
        // 进行阻塞
        int len = inputStream.read(bytes);
        // 调用数据
        System.out.println("客户端数据 " + new String(bytes, 0, len));
        // 进行资源释放
        inputStream.close();
    }
}
