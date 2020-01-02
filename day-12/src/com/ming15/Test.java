package com.ming15;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 需求：创建新项目，按以下要求编写代码：

1. 在项目下创建TCP 服务器端 端口号为8888

2. 等待客户端连接，如果有客户端连接则获取到客户端对象

3. 在获取到客户端对象之后 在服务器读取客户端传送的数据
*
* */
public class Test {
    public static void main(String[] args) throws IOException {
        // 创建服务器
        ServerSocket serverSocket = new ServerSocket(666);
        // 服务器启动完成
        System.out.println("服务器启动完成");
        InputStream inputStream = null;
        Socket socket = null;
            // 获取到客户端对象
            socket = serverSocket.accept();
            // 获取输入流
            inputStream = socket.getInputStream();
            // 接收传入的对象
            int len = 0;
            byte[] bytes = new byte[1024];
            // 进行输入
            while ((len = inputStream.read(bytes)) != -1) {
                // 进行输出
                System.out.println(new String(bytes, 0, len));
            }
            // 释放资源
        inputStream.close();
            socket.close();
            serverSocket.close();
            System.out.println("服务器关闭....");
    }
}
