package com.ming7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    // 进行读取
    public static void main(String[] args) throws IOException {
        // 自定义 Student 类型
        List<Student> studentList = new ArrayList<>();
        // 进行读取
        Scanner scanner = new Scanner(System.in);
        // 进行循环读取
        while(true){
            // 如果是 end 进行结束
            String res = scanner.nextLine();
            // 进行读取
            if(!res.equals("end")){
                // 进行字符串分割
                String[] tmp = res.split("-");
                // 进行读取 读取以后进行保存
                studentList.add(new Student(UUID.randomUUID() + "", tmp[0], tmp[1], tmp[2]));
            }else{
                //如果不是则退出循环
                break;
            }
        }
        // 进行输入到文件中
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\ming\\ming.txt");
        // 进行循环输入
        for(Student student:studentList){
            // 进行输入
            fileOutputStream.write(student.toString().getBytes());
            // 输出换行符
            fileOutputStream.write("/n".getBytes());
        }
    }
}
