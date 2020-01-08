package com.ming9;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class StudentManagerImpl implements StudentManager {
    @Override
    public void getStudentInfo(String name,String sex, int age) throws IOException {
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
        // 生成 Student对象
        Student student = new Student(name, age, sex);
        // 进行学员查询
        list.forEach((student1 -> {
            // 进行判断
            if(student1.equals(student)){
                // 此时相等
                System.out.println("此时相等");
            }else{
                System.out.println("此时不相等");
            }
        }));
    }
}
