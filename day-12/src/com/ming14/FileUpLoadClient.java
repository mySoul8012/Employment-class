package com.ming14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class FileUpLoadClient {
    public static void main(String[] args) throws IOException {
        // 创建客户端连接服务器
        Socket socket = new Socket("127.0.0.1", 666);
        // 获取输出流
        OutputStream outputStream = socket.getOutputStream();
        // 创建文件输入流
        FileInputStream  fileInputStream = new FileInputStream("C:\\ming\\ming.txt");
        // 进行读取文件
        byte[] bytes = new byte[1024];
        // 进行读取
        int len = 0;
        System.out.println("正在给服务器发送文件");
        while((len = fileInputStream.read(bytes)) !=-1){
            outputStream.write(bytes, 0, len);
        }
        // 关闭输出流
        socket.shutdownOutput();
        System.out.println("文件发送完毕");
        System.out.println("文件发送完毕");
        // 获取输入流
        InputStream inputStream = socket.getInputStream();
        // 调用 read 方法
        byte[] bytes1 = new byte[1024];
        // 进行数据发送
        int len1 = inputStream.read(bytes);
        // 进行数据发送
        System.out.println("服务器回复 " + new String(bytes, 0, len));


    }
}
