package com.ming19;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        Scanner scanner = new Scanner(System.in);
        // 进行数据写入
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 进行数据读取
        while(true){
            String tmp = scanner.nextLine();
            // 进行数据判断
            if(tmp.equals("exit")){
                // 退出
                break;
            }

            // 如果数据不是，进行数据写入
            bufferedWriter.write(tmp);
            // 写入换行符
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
