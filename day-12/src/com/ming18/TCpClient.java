package com.ming18;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// 数据录入端
public class TCpClient {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // 创建 Socket
        Socket socket = new Socket("127.0.0.1", 8889);
        // 获取 inputStream
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 进行数据录入
        while(true){
            // 获取数据
            String tmp = scanner.nextLine();
            // 进行判断
            if(tmp.equals("exit")){
                // 进行退出循环
                break;
            }
            // 如果不是，进行输出
            System.out.println("对方发来信息为 " + tmp);
        }
    }
}
