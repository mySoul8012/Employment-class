package com.ming20;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 创建服务器端
public class SocketServer {
    public static void main(String[] args) throws IOException {
        // 创建服务器端
        ServerSocket serverSocket = new ServerSocket(12345);
        while(true){
            // 获取服务器端
            Socket socket = serverSocket.accept();
            // 启动线程
            new Thread(new UploadThread(socket)).start();
        }
    }
}
