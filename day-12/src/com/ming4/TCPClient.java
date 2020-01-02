package com.ming4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 创建客户端
        Socket socket = new Socket("127.0.0.1", 8089);
        // 进行服务器连接
        System.out.println("服务器连接成功");
        // 调用 out 的write 方法
        Thread.sleep(5000);
        // 进行输出
        OutputStream outputStream = socket.getOutputStream();
        //进行调用 out 的write 方法
        outputStream.write("你好 我来啦".getBytes());
        // 进行数据发送
        System.out.println("数据发送成功");
        outputStream.close();
        socket.close();
        System.out.println("客户端关闭成功");
    }
}
