package com.ming;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BufferedDemo03 {
    public static void main(String[] args) throws IOException {
        // 创建数组保存文件
        List<String> list = new ArrayList<>();
        // 进行读取文件 使用缓冲字节流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day-11\\src\\1.properties"));
        // 进行文件读取
        String tmp = null;
        // 进行读取
        while((tmp = bufferedReader.readLine()) != null){
            // 进行读取，保存进入数组中
            list.add(tmp);
        }
        // 输出数组
        for(String lists: list){
            // 输出数据
            System.out.println(lists);
        }

        // 数据进行排序
        Collections.sort(list, (t1, t2) -> t2.charAt(0) - t1.charAt(0));
        // 输出数据
        for(String lis:list){
            System.out.println(lis);
        }
        // 关闭缓冲
        bufferedReader.close();

    }
}
