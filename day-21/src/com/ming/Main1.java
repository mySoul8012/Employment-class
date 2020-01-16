package com.ming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main1 {
    public static void main(String[] args) throws IOException {
        // 编写ServerSOcket
        ServerSocket serverSocket = new ServerSocket(8084);
        while(true){
            Socket socket = serverSocket.accept();
            // 创建输出流
            OutputStream outputStream = socket.getOutputStream();
            // 进行输出
            outputStream.write("HTTP/1.1 200 OK\n".getBytes());
            outputStream.write("Content-Type:text/html;charset=utf-8;\n\n".getBytes());
            outputStream.write("hello.....".getBytes());
            // 进行刷新
            outputStream.flush();
            // 进行关闭
            outputStream.close();
            socket.close();
        }
    }
}
