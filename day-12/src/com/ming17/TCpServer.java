package com.ming17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        // 得到对象
        Socket socket = serverSocket.accept();
        // 获取字符输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 进行数据输出
        while(true){
            String tmp = bufferedReader.readLine();
            // 输出
            System.out.println(tmp);
        }


    }
}
