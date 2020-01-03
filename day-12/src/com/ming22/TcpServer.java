package com.ming22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 创建服务器端
public class TcpServer {
    public static void main(String[] args) throws IOException {
        // 创建服务器
        ServerSocket serverSocket = new ServerSocket( 12345);
        // 获取socket创建线程
        while(true){
            // 进行阻塞
            Socket socket = serverSocket.accept();
            // 进行创建线程
            new Thread(new DownLoadThread(socket)).start();
        }
    }
}
