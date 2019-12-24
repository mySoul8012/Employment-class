package com.ming7.main;

import com.ming7.student.Student;
import com.ming7.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 学生数组
        List<Student> studentList = new ArrayList<Student>();
        // 教师数组
        List<Teacher> teacherList = new ArrayList<Teacher>();
        // 生成菜单
        while(true){
            System.out.println("菜单显示");
            System.out.println("-------------");
            System.out.println("请输入功能编号");
            System.out.println("1. 学员信息管理  2 教师信息管理  3 退出");
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    studentJiemiang(studentList, scanner);
                    System.out.println("进入学生信息管理界面");
                    break;
                case 2:
                    System.out.println("进入教师信息管理界面");
                    break;
                case 3:
                    System.out.println("退出，谢谢！");
                    System.exit(0);
                    break;
            }
        }
    }

    // 学生信息管理方法类
    private static void studentJiemiang(List<Student> studentList, Scanner scanner) {
        // 输出二级子菜单
        while(true){
            System.out.println("学生信息界面");
            System.out.println("1. 添加学员   2. 修改学员  3. 删除学员   4. 查询学员   5. 返回");
            int number = scanner.nextInt();
            switch (number){
                case 1:
                    System.out.println("进入添加学生界面");
                    addStudent(studentList, scanner);
                    break;
                case 2:
                    System.out.println("进入修改学生界面");
                    updateStudent(studentList, scanner);
                    break;
                case 3:
                    System.out.println("进入删除学生界面");
                    removeStudent(studentList, scanner);
                    break;
                case 4:
                    System.out.println("进入查询学生界面");
                    selectStudent(studentList, scanner);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("您的信息输入错误");
            }
        }
    }

    // 查询学生界面
    private static void selectStudent(List<Student> studentList, Scanner scanner) {
        // 判断数组是否为空
        if(studentList.size() == 0){
            System.out.println("您的信息为空");
            return;
        }
        // 进行数组输出
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    // 删除学生界面
    private static void removeStudent(List<Student> studentList, Scanner scanner) {
       System.out.println("进入删除学生界面");
       // 获取删除的学生id
        System.out.println("请输入学生id");
        int id = scanner.nextInt();
        // 获取学生对象
        Student student = studentList.get(id - 1);
        // 删除学生对象
        studentList.remove(student);
    }

    // 修改学生信息界面
    private static void updateStudent(List<Student> studentList, Scanner scanner) {
        System.out.println("进入学生修改界面");
        System.out.println("请输入学生id");
        int id = scanner.nextInt();
        // 获取学生对象
        Student student = studentList.get(id);
        // 进行学生对象修改
        System.out.println("修改学生姓名");
        student.setName(scanner.nextLine());
        System.out.println("修改学生年龄");
        student.setAge(scanner.nextInt());
        System.out.println("修改学生出生日期");
        student.setBirthday(scanner.nextLine());
        System.out.println("修改学生年龄");
        student.setAge(scanner.nextInt());
        System.out.println("输出学生的信息");
        System.out.println(student);
    }


    /**
     * 添加学生方法
     */
    private static void addStudent(List<Student> studentList, Scanner scanner) {
        System.out.println("进入添加学生界面");
        System.out.println("请输入学生id");
        int id = scanner.nextInt();
        // 生成学生对象
        Student student = new Student();
        // 进行学生数据添加
        System.out.println("请输入学生姓名");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.println("请输入学生性别");
        String sex = scanner.nextLine(); // 学生性别
        student.setSex(sex);
        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();
        student.setAge(age);
        System.out.println("请输入学生出生日期");
        String birthday = scanner.nextLine();
        student.setBirthday(birthday);
        // 学生对象添加ArrayList
        studentList.add(student);
    }
}
