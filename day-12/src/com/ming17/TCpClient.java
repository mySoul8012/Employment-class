package com.ming17;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCpClient {
    public static void main(String[] agrs) throws IOException {
        // 创建录入对象
        Scanner scanner = new Scanner(System.in);
        // 创建 Socket 对象
        Socket socket = new Socket("127.0.0.1", 12345);
        // 创建字符读入
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 进行循环
        while(true){
            String tmp = scanner.nextLine();
            if(tmp.equals("exit")){
                // 退出循环
                break;
            }
            // 读入
            bufferedWriter.write(scanner.nextLine());
            // 添加换行符
            bufferedWriter.newLine();
        }
        // 关闭对象
        bufferedWriter.close();
        scanner.close();
    }
}
