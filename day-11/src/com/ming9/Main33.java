package com.ming9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main33 {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("333.txt"));
        // 进行读取
        List<String> list = new ArrayList<String>();
        // 进行读取
        String tmp = null;
        while((tmp = bufferedReader.readLine()) != null){
            // 进行保存
            list.add(tmp);
        }
        // 进行打印
        for(String tmp1:list){
            System.out.println(tmp1);
        }

    }
}
