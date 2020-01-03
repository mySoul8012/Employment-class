package com.ming28;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 定义 TCP 发送
public class TcpSend {
    public static void main(String[] args) throws IOException {
        // 创建 TCp 发送
        ServerSocket serverSocket = new ServerSocket(54321);
        // 进行TCp发送
        while(true){
            Socket socket = serverSocket.accept();
            // 进行数据获取
            InputStream inputStream = socket.getInputStream();
            // 进行数据接收
            int len = 0;
            byte[] bytes = new byte[1024];
            // 进行数据获取
            while((len = inputStream.read(bytes)) != -1){
                // 进行数据生成
                System.out.println(new String(bytes, 0, len));
            }
        }
    }
}
