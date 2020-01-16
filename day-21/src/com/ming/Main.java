package com.ming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        // 编写ServerSocket监听8080端口
        ServerSocket serverSocket = new ServerSocket(8083);
        // 进行循环
        while(true){
            // 创建null
            Socket socket = null;
            InputStream inputStream = null;
            OutputStream outputStream = null;
            // 进行判断请求
            try{
                // 接收浏览器端的请求
                socket = serverSocket.accept();
                System.out.println("服务器端接收到请求了...");
                // 获取输入流对象
                inputStream = socket.getInputStream();
                // 获取输出流对象
                outputStream = socket.getOutputStream();
                // 写回响应行
                outputStream.write("HTTP/1.1 200 OK\n".getBytes());
                // 写回相应头信息
                outputStream.write("Content-Type:text/html;charset=utf-8;\n\n".getBytes());
                // 写回响应体信息
                outputStream.write("hello....".getBytes());
                // 进行刷新
                outputStream.flush();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                if(null != outputStream)
                    outputStream.close();
                if(null != inputStream)
                    inputStream.close();
                if(null != socket)
                    socket.close();
            }
        }
    }
}
