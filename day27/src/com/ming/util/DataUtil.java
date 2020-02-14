package com.ming.util;

import com.ming.domain.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    // 从文件中读取所有学员信息
    public static List<Student> readAll(){
        // 保存所有学生对象信息
        List<Student> studentList = new ArrayList<>();
        // 进行文件获取
        try{
            // 获取文件真实路径
            String realPath = DataUtil.class.getClassLoader().getResource("student.txt").getPath();
            // 获取字符输入流
            Reader reader = new InputStreamReader(new FileInputStream(realPath), "UTF-8");
            // 创建字符缓冲流
            BufferedReader bufferedReader = new BufferedReader(reader);
            // 进行一次一行读取
            String row = null;
            while((row = bufferedReader.readLine()) != null){
                String[] arr = row.split(",");
                Student student = new Student();
                student.setId(arr[0]);
                student.setName(arr[1]);
                student.setSex(arr[2]);
                student.setAge(arr[3]);
                //student 对象添加到集合
                studentList.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    // 文件写入学员信息
    public static void writeAll(List<Student> students) throws IOException {
        // 获取文件真实路径
        String realPsth = DataUtil.class.getClassLoader().getResource("student.txt").getPath();
        // 创建输出流
        Writer writer = new OutputStreamWriter(new FileOutputStream(realPsth), "UTF-8");
        // 创建字符缓冲流
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        // 循环写入文本
        for(Student student:students){
            bufferedWriter.write(student.getId() + "," + student.getName() + "," + student.getSex() + "," + student.getAge());
            // 创建新的一行
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
