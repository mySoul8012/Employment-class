package com.ming23;

import java.io.*;
import java.net.Socket;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 创建线程读取
        Socket socket = new Socket("127.0.0.1", 8900);
        // 获取输入流
        InputStream inputStream = socket.getInputStream();
        // 获取输出流
        OutputStream outputStream = new FileOutputStream(new File("33.txt"));
        // 进行文件传输
        int len = 0;
        byte[] bytes= new byte[1024];
        // 进行文件复制
        while((len = inputStream.read(bytes)) != -1){
            outputStream.write(bytes, 0, len);
            System.out.println(bytes);
        }
        // 流关闭
        outputStream.close();
        inputStream.close();
    }
}
