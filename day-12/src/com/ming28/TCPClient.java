package com.ming28;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

// 进行数据发送
public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 进行数据发送
        Socket socket = new Socket("127.0.0.1", 54321);
        // 获取输出流
        OutputStream outputStream = socket.getOutputStream();
        // 进行数据写入
        while(true){
            outputStream.write("hello 我来了".getBytes());
        }
    }
}
