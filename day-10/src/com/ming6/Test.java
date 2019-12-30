package com.ming6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        // 循环接收录入学生信息
        Scanner scanner = new Scanner(System.in);
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\ming\\ming.txt");
        // 接收学生信息
        while(true){
            // 获取数据
            String line = scanner.nextLine();
            // 遇到 end 停止循环
            if(line.equals("end")){
                // 停止循环
                System.exit(-1);
            }
            // 进行循环
            fileOutputStream.write(line.getBytes());
        }
    }
}
