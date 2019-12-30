package com.ming6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 读取信息保存到 info.txt 文件
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\ming\\ming.txt");
        // 获取数据
        Scanner scanner = new Scanner(System.in);
        // 进行读取
        while(true){
            // 进行读取
            String info = scanner.nextLine();
            // 进行判断
            if(info.equals(886)){
                // 程序停止运行
                System.exit(-1);
            }
            // 进行录入
            fileOutputStream.write(info.getBytes());
        }
    }
}
