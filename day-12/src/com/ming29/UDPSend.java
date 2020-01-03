package com.ming29;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 文件上传服务器端
public class UDPSend {
    public static void main(String[] args) throws IOException {
        // 创建文件上传服务器端
        ServerSocket serverSocket = new ServerSocket(54321);
        while(true){
            Socket socket = serverSocket.accept();
            // 获取文件
            new Thread(new UPLOadThread(socket)).start();
        }
    }
}
