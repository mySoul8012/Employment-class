package com.ming.util;

import com.ming.domain.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    // 从文件中读取学员信息
    public static List<Student> readAll(){
        // 保存学生对象信息
        List<Student> studentList = new ArrayList<>();
        // 获取文件路径
        try{
            String realPath = DataUtil.class.getClassLoader().getResource("student.txt").getPath();
            //创建输入流
            Reader reader = new InputStreamReader(new FileInputStream(realPath), "UTF-8");
            // 创建字符缓冲流
            BufferedReader bufferedReader = new BufferedReader(reader);
            // 一次读取一行
            String row = null;
            // 进行循环
            while((row = bufferedReader.readLine()) != null){
                String[] arr = row.split(",");
                // 创建对象
                Student student = new Student();
                // 进行赋值
                student.setId(arr[0]);
                student.setName(arr[1]);
                student.setSex(arr[2]);
                student.setAge(arr[3]);
                // 对象添加到集合
                studentList.add(student);

            }
            // 关闭掉
            bufferedReader.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public static void writerAll(List<Student> students){
        // 获取文件路径
        try{
            String realPath = DataUtil.class.getClassLoader().getResource("student.txt").getPath();
            // 创建输出流
            Writer writer = new OutputStreamWriter(new FileOutputStream(realPath), "UTF-8");
            // 创建字符缓冲流
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            // 循环写入文本
            for (Student student : students) {
                // 循环写入文本
                bufferedWriter.write(student.toString());
                // 输出换行
                bufferedWriter.newLine();
                // 进行刷新
                bufferedWriter.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
