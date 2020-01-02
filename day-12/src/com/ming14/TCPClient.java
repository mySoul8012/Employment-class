package com.ming14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建客户端
        Socket socket = new Socket("127.0.0.1", 54321);
        // 进行服务器连接
        System.out.println("服务器连接成功");
        // 获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        // 调用 out 中的write方法
        Thread.sleep(5000);
        // 进行输出
        outputStream.write("你好，，我来了".getBytes());
        // 获取通道中的 输入流
        InputStream inputStream = socket.getInputStream();
        // 调用 in 的read 方法
        System.out.println("等待服务器的回信");
        byte[] bytes = new byte[1024];
        // 进行阻塞
        int len = inputStream.read(bytes);
        // 进行输出
        System.out.println("服务器说 " + new String(bytes, 0, len));
        // 进行资源释放
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端关闭成功");
    }
}
