package com.ming29;

import java.io.*;
import java.net.Socket;

// 创建 TCP 文件上传
public class UDPClient {
    public static void main(String[] args) throws IOException {
        // 创建TCP文件上传
        Socket socket = new Socket("127.0.0.1", 98764);
        // 进行文件发送
        OutputStream outputStream = socket.getOutputStream();
        // 进行文件发送
        int len = 0;
        byte[] bytes = new byte[1024];
        // 获取文件输出流
        InputStream inputStream1 = new FileInputStream(new File("C:\\ming\\ming.txt"));
        // 进行文件输出
        while((len = inputStream1.read(bytes)) != -1){
            // 进行文件发送
            outputStream.write(bytes, 0, len);
        }

        // 获取上传结果
        InputStream inputStream = socket.getInputStream();
        //进行文件读取
        while((len = inputStream.read(bytes)) != -1){
            // 进行文件输出
            System.out.println(new String(bytes, 0, len));
        }
        // 关闭流
        outputStream.close();
        inputStream1.close();
        socket.close();
    }
}
