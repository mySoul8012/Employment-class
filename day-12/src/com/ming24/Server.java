package com.ming24;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // 创建Socket Server
        ServerSocket serverSocket = new ServerSocket(23532);
        // 进行连接
        while(true){
            Socket socket = serverSocket.accept();
            // 创建线程
            new java.lang.Thread(new Thread(socket)).start();
        }
    }
}
