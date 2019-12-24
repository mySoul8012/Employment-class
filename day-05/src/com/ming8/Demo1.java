package com.ming8;

import com.ming5.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Demo1 {
    private static List<Person>  studentList = new LinkedList<>();
    public static void main(String[] args){
        while(true) {
            System.out.println("请输入学生姓名");
            Person person = new Person();
            Scanner scanner = new Scanner(System.in);
            // 获取学生姓名
            String name = scanner.nextLine();
            person.setName(name);
            // 获取学生年龄
            System.out.println("请输入学生年龄");
            String age = scanner.nextLine();
            person.setAge(Integer.parseInt(age));
            // 获取学生性别
            System.out.println("请输入学生性别");
            String sex = scanner.nextLine();
            person.setGender(sex);
            // 从容器中检索该对象
            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).equals(person)) {
                    System.out.println("存在已有的对象");
                    System.exit(1);
                }
            }
            // 添加对象
            studentList.add(person);

            // 输出集合
            System.out.println(studentList);
        }
    }
}
