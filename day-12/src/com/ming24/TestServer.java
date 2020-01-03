package com.ming24;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        // 创建服务器
        ServerSocket serverSocket = new ServerSocket(9093);
        // 创建线程
        while(true){
            Socket socket = serverSocket.accept();
            // 创建线程
            new Thread(new ThreadSever(socket))
        }
    }
}
