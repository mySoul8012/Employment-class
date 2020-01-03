package com.ming23;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {
    public static void main(String[] args) throws IOException {
        // 创建服务器端
        ServerSocket serverSocket = new ServerSocket(8900);
        // 创建阻塞线程
        while(true){
            Socket socket = serverSocket.accept();
            // 进行线程创建
            new Thread(new DownLoadThread(socket)).start();
        }

    }
}
