package com.ming8;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException {
        // 创建用户数组
        List<User> users = new ArrayList<>();
        // 获取输入字符流
        // 创建输入流
        InputStream inputStream = new FileInputStream(new File("C:\\ming\\user.txt"));
        // 获取文件字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        // 进行循环读取
        String tmp = null;
        // 进行读取
        while(true){
            // 进行读取
            tmp = bufferedReader.readLine();
            // 进行判断是否为空
            if(tmp == null){
                // 进行退出循环
                break;
            }
            // 进行分割
            String[] tmp1 = tmp.split(",");
            // 获取生成用户名，密码对象
            // 生成用户名
            users.add(new User(tmp1[0], tmp1[1]));
        }
        // 进行输出结果
        System.out.println(users.size());
        // 进行打印
       // 获取用户名
        Scanner scanner = new Scanner(System.in);
        // 获取用户数组
        String tmp1 = scanner.nextLine();
        // 进行字符串分割
        String[] yonghu = tmp1.split(",");
        // 生成用户对象
        User user = new User(yonghu[0], yonghu[1]);
        // 进行用户对象判断，取出用户名相同的对象
        User user2 = null;
        for(User user1:users){
            // 进行判断
            if(user1.equals(user)){
                // 相等取出用户对象
                user2 = user1;
            }
        }
        // 进行密码判断
        if(user2.getPassword().equals(user.getPassword())){
            // 如果此时相等，进行输出结果
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
