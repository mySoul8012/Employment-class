package com.ming30;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 编写模拟 b /s服务器的案例
public class Test {
    public static void main(String[] args) throws IOException {
        // 定义SocketServer
        ServerSocket serverSocket = new ServerSocket(8888);
        // 进行阻塞
        while(true){
            Socket socket = serverSocket.accept();
            // 获取输入流
            InputStream inputStream = socket.getInputStream();
            // 获取输出流
            OutputStream outputStream = socket.getOutputStream();
            // 获取输入结果
            int len = 0;
            byte[] bytes = new byte[1024];
            // 进行输出
            while((len = inputStream.read(bytes)) != -1){
                // 进行输出
                System.out.println(new String(bytes, 0, len));
            }
            // 给浏览器输出结果
            outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
            outputStream.write("\r\n".getBytes());
            // 进行资源读取
            outputStream.write("你好哈".getBytes());
            outputStream.flush();
            // 进行关闭
            outputStream.close();
            inputStream.close();
        }
    }
}
