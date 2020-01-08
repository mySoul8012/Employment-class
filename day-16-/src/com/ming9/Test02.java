package com.ming9;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 定义学数组
        List<Student> list = new ArrayList<>();
        // 进行循环添加
        // 进行循环添加
        InputStreamReader inputStreamReader = new FileReader(new File("C:\\ming\\user.txt"));
        // 获取输入
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        // 进行文件读取
        String tmp = null;
        // 进行循环
        while(true){
            // 进行判断
            tmp = bufferedReader.readLine();
            // 如果为空，退出循环
            if(tmp == null){
                break;
            }
            // 进行字符串分割
            String[] strings = tmp.split(",");
            // 生成对象
            list.add(new Student(strings[0], Integer.parseInt(strings[1]), strings[2]));
        }
        // 进行打印
        System.out.println(Arrays.toString(list.toArray()));
    }
}
