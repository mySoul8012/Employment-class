package com.ming19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// 创建Server 端
public class TcpServer {
    public static void main(String[] args) throws IOException {
        // 创建Server
        ServerSocket serverSocket = new ServerSocket(8888);
        //获取到 Socket对象
        Socket socket = serverSocket.accept();
        // 获取到输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 进行读取
        while(true){
            String tmp = bufferedReader.readLine();
            // 进行输出
            System.out.println("接收到的数据为 " + tmp);
        }
    }
}
