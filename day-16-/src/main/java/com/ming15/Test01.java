package com.ming15;

import java.io.*;
import java.util.Calendar;

public class Test01 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("C:\\ming\\user.txt")));
        // 创建缓存对象
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // 进行读取
        while(true){
            String tmp = bufferedReader.readLine();
            // 进行判断
            if(tmp != null){
                // 进行退出
                break;
            }

            // 进行输出
            System.out.println(tmp);
        }

    }
}
