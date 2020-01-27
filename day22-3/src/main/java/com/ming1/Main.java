package com.ming1;

import java.awt.im.InputContext;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // 进行录入学生对象
        for(int i = 0; i < 5; i++){
            System.out.println("学生对象保存，输入学生姓名");
            Student student = new Student();
            student.setName(scanner.nextLine());
            System.out.println("输入学生年龄");
            student.setAge(scanner.nextLine());
            System.out.println("输入学生分数");
            student.setScore(scanner.nextLine());
            student.setId(UUID.randomUUID() + "");
            // 对象保存
            list.add(student);
        }
        // 创建对象
        File file = new File("1.txt");
        OutputStream outputStream = new FileOutputStream(file);
        // 创建对象
        ObjectOutputStream objectOutputStream;
        objectOutputStream = new ObjectOutputStream(outputStream);
        // 对象进行保存
        objectOutputStream.writeObject(list);
        // 进行读取
        InputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        // 进行对象导出
        List<Student> list1 = new ArrayList<>();
        list1 = (List<Student>) objectInputStream.readObject();
        // 进行输出
        for (Student student : list1) {
            System.out.println(student);
        }

    }
}
