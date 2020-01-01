package com.ming4;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05 {
    public static void main(String[] args) throws IOException {
        // 进行文件读取
        BufferedReader bufferedReader = new BufferedReader(new FileReader("2.txt"));
        // 创建集合保存
        List<String> list = new ArrayList<>();
        // 进行读取保存进入集合
        String tmp = null;
        while((tmp = bufferedReader.readLine()) != null){
            // 进入保存
            list.add(tmp);
        }
        // 进行翻转
        Collections.reverse(list);
        // 输出
        for(String syr:list){
            System.out.println(syr);
        }

        // 写入
        // 创建 BUffer
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("33.txt"));
        // 进行文件读入
        for(String str:list){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
