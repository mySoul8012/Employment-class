package com.ming7;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args){
        System.out.println("进行学生添加");
        System.out.println("请输入学生姓名");
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        // 获取学生姓名
        String name = scanner.nextLine();
        student.setName(name);
        // 获取学生地址
        System.out.println("请输入学生地址");
        String address = scanner.nextLine();
        student.setAddress(address);
        // 获取学生年龄
        System.out.println("请输入学生年龄");
        String age = scanner.nextLine();
        student.setAge(age);
        // 生成学生id
        student.setId(UUID.randomUUID() + "");
        // 保存学生对象
        IDataOperation<Student> iDataOperation = new IDataOperationImpl();
        if(iDataOperation.add(student)){
            System.out.println("学生添加成功");
        }
        // 输出学生
        List<Student> list = iDataOperation.getArrayList();
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getId());
        }
    }
}
