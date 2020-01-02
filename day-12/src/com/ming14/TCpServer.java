package com.ming14;

import javax.swing.text.Style;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCpServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建一个服务器
        ServerSocket serverSocket = new ServerSocket(6666);
        // 进行服务器启动
        System.out.println("服务启动");
        // 等待接收客户端
        System.out.println("等待客户端");

            // 进行阻塞
            Socket socket = serverSocket.accept();
        while(true) {
            // 获取输入流
            InputStream inputStream = socket.getInputStream();
            // 调用 in 的read方法
            byte[] bytes = new byte[1024];
            // 进行接收数据
            System.out.println("进行接收数据");
            int len = inputStream.read(bytes);
            // 进行输出
            System.out.println("客户端说 " + new String(bytes, 0, len));
            // 获取通道中的输出流
            OutputStream outputStream = socket.getOutputStream();
            // 调用 输出流的write方法
            Thread.sleep(5000);
            // 进行输出输入
            outputStream.write("您的消息收到了".getBytes());
            // 进行输出输出
            System.out.println("数据回复成功");
        }
    }
}
