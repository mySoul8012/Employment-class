package com.ming22;

import java.io.*;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        // 创建TcpClient
        Socket socket = new Socket("127.0.0.1", 12345);
        // 获取输入流
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = new FileOutputStream(new File("ming.txt"));
        // 进行文件复制
        int len = 0;
        byte[] bytes = new byte[1024];
        // 获取文件输入流
        while((len = inputStream.read(bytes)) != -1){
            // 进行文件复制
            outputStream.write(bytes, 0, len);
        }
        System.out.println("文件复制完成");
        // 关闭流
        outputStream.close();
        inputStream.close();
        socket.close();
    }
}
