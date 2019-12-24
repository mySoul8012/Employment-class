package com.ming6;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 获取数据
        String name = scanner.nextLine();
        // 进行数据解析 按照,分割
        String[] res = name.split(",");
        // 打印数组
        System.out.println(res.length);
        // 进行数据存储
        Student student = new Student();
        student.setName(res[0]);
        student.setAge(Integer.parseInt(res[1]));
        student.setSex(res[2].charAt(0));
        System.out.println(student);
    }
}
