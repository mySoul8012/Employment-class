package com.ming4;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 用户在控制台输入三个验证码
        write2Coder();
        // 校验验证码
        verifCoder();
    }

    // 检验验证码
    private static void verifCoder() throws IOException {
        // 创建集合保存
        List<String> list = new ArrayList<>();
        // 创建输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("22.txt"));
        // 进行读取
        String tmp = null;
        // 进行读取
        while(null != (tmp = bufferedReader.readLine())){
            // 进行读取
            list.add(tmp);
        }
        Scanner scanner = new Scanner(System.in);

        // 进行验证码校验
        for(int i = 0; i < 3; i++){
            // 验证码校验
            System.out.println("请输入 第 " + i + "个验证码");
            // 进行校验
            if(list.get(i).equals(scanner.nextLine())){
                System.out.println("校验成功");
            }else{
                System.out.println("校验失败");
            }
        }
    }

    // 输入三个验证码
    private static void write2Coder() throws IOException {
        // 创建输入流
        Scanner scanner = new Scanner(System.in);
        // 创建输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("22.txt"));
        // 进行循环录入
        for(int i = 0; i < 3; i++){
            // 进行循环录入
            System.out.println("请输入第 " + (i + 1) + "个字符");
            // 进行录入
            String tmp = scanner.nextLine();
            // 创建换行符
            bufferedWriter.write(tmp);
            bufferedWriter.newLine();
        }
        // 关闭流
        bufferedWriter.close();
    }
}
