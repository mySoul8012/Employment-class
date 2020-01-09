package com.ming10;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        // 获取输入流
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("C:\\ming\\user.txt")));
        // 获取buffer流
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // 进行读取
        while(true){
            // 读取一行
            String tmp = bufferedReader.readLine();
            // 进行判空
            if(tmp == null){
                break;
            }

            // 进行输出
            System.out.println(tmp);
        }
    }
}
