package com.ming9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        // 保存数据
        list.add("xaxiaoxiao");
        list.add("ingming");
        list.add("iminggg");
        // 进行持久化保存
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("333.txt"));
        // 写入数据
        list.forEach((s -> {
            try {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        // 关闭流
        bufferedWriter.close();
    }
}
