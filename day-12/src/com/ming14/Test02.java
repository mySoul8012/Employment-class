package com.ming14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// 创建 TCP 客户端
public class Test02 {
    public static void main(String[] agrs) throws IOException {

        Socket socket = new Socket("127.0.0.1", 6666);
        while(true) {
        // 获取输出流
        OutputStream outputStream = socket.getOutputStream();
        // 获取输入内容

            outputStream.write("hello 服务器，我是客户端".getBytes());
        }

    }
}
