package com.ming20;

import java.io.*;
import java.net.Socket;

// 创建客户端
public class TcpClient {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket = new Socket("127.0.0.1", 12345);
        // 获取客户端输出流
        OutputStream outputStream = socket.getOutputStream();
        // 创建文件输入流
        InputStream inputStream = new FileInputStream(new File("C:\\Program Files\\feiq\\Recv Files\\126期\\day12\\junit-4.10.jar"));
        // 进行文件上传
        int len = 0;
        byte[] bytes = new byte[10];
        // 进行文件上传
        while((len = inputStream.read(bytes)) != -1){
            // 进行文件复制
            outputStream.write(bytes, 0, len);
        }
        // 获取接收流
        InputStream inputStream1 = socket.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        // 进行输出
        int len1 = 0;
        byte[] bytes1 = new byte[1024];
        while((len1 = bufferedInputStream.read(bytes1)) != -1){
            // 打印出结果
            System.out.println(new String(bytes1, 0, len1));
        }
        // 关闭流
        inputStream.close();
        outputStream.close();
    }
}
