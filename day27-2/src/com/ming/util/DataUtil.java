package com.ming.util;

import com.ming.domain.Student;

import java.awt.dnd.DragGestureEvent;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    // 读取全部学生
    public static List<Student> readAll() throws IOException {
        // 读取全部学生
        List<Student> list = new ArrayList<>();
        // 获取路径

            String path = DataUtil.class.getClassLoader().getResource("/com/ming/student.txt").getPath();
            System.out.println(path);
            // 获取文件输入路径
            try {
                Reader reader = new InputStreamReader(new FileInputStream(path));
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = null;
                while((line = bufferedReader.readLine()) != null){
                    // 进行读取
                    String[] tmp = line.split(",");
                    // 创建对象
                    Student student = new Student();
                    student.setId(tmp[0]);
                    student.setName(tmp[1]);
                    student.setAge(tmp[2]);
                    student.setSex(tmp[3]);
                    // 添加list
                    list.add(student);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            // 返回
        return list;
    }

    // 写入文件
    public static void writeAllStudent(List<Student> list) throws IOException {
        // 写入文件
        // 获取文件路径
        String path = DataUtil.class.getClassLoader().getResource("/com/ming/student.txt").getPath();
        // 创建输出流
        Writer writer = new OutputStreamWriter(new FileOutputStream(path), "UTF-8");
        // 创建缓冲流
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        // 进行文件写入
        for (Student student : list) {
            // 进行文件写入
            bufferedWriter.write(student.toString());
            // 写入一行
            bufferedWriter.newLine();
        }
        bufferedWriter.close();


    }
}
