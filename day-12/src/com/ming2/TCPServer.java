package com.ming2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // 创建服务器
        ServerSocket serverSocket = new ServerSocket(54321);
        // 进行服务器启动
        System.out.println("服务器启动");
        // 等待接收客户端
        System.out.println("等待客户端");
        // 进行方法阻塞
        Socket socket = serverSocket.accept();
        // 进行客户端阻塞
        System.out.println("客户端来了");
        // 获取通道中的输入流
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        // 进行数据发送
        System.out.println("正在接收客户端数据");
        // 进行方法阻塞
        int len = inputStream.read(bytes);
        // 进行数据发送
        System.out.println("客户端发送 " + new String(bytes, 0, len));
        // 进行资源释放
        inputStream.close();
        socket.close();
    }
}
