package com.ming24;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

// 创建SocketCilent
public class Client {
    public static void main(String[] args) throws IOException {
        // 创建Socket
        Socket socket = new Socket("127.0.0.1", 23532);
        Scanner scanner = new Scanner(System.in);
        // 进行连接
        while(true){
            // 获取输入流
            InputStream inputStream = socket.getInputStream();
            // 获取输出流
            OutputStream outputStream = socket.getOutputStream();
            // 获取键盘录入
            String tmp = scanner.nextLine();
            // 进行字符串分割
            String[] strings = tmp.split("-");
            // 生成User对象
            User user = new User(strings[0], strings[1]);
            // 进行序列化
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            // 输出到socket
            objectOutputStream.writeObject(user);
            // 获取结果
            InputStream inputStream1 = socket.getInputStream();
            // 输出结果
            int len = 0;
            byte[] bytes = new byte[1024];
            // 进行输出
            while((len = inputStream1.read(bytes)) != -1){
                // 进行输出结果
                System.out.println(new String(bytes, 0, len));
            }
            System.out.println(user);
        }
    }
}
