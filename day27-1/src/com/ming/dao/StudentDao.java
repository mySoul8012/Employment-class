package com.ming.dao;

import com.ming.domain.Student;
import com.ming.util.DataUtil;

import java.awt.image.DataBufferUShort;
import java.util.List;

public class StudentDao {
    // 查询所有学生方法
    public List<Student> findAllStudents(){
        // 从文件中查询数据
        List<Student> studentList = DataUtil.readAll();
        // 进行返回
        return studentList;
    }

    // 写入学生
    public boolean addStudent(Student student){
        // 从文件中查询数据
        List<Student> studentList = DataUtil.readAll();
        // 添加学生
        studentList.add(student);
        // 重新写入
        DataUtil.writerAll(studentList);
        // 返回结果
        return true;
    }

    // 修改学生
    public boolean changeStudent(Student student){
        // 获取文件数据
        List<Student> studentList = DataUtil.readAll();
        // 进行遍历
        for (Student student1 : studentList) {
            // 进行判断
            if(student1.getId().equalsIgnoreCase(student.getId())){
                // 删除
                studentList.remove(student1);
                // 添加
                studentList.add(student);
            }
        }
        // 进行写入
        DataUtil.writerAll(studentList);
        // 返回
        return true;
    }

    //删除
    public boolean remove(Student student){
        // 获取数据
        List<Student> list = DataUtil.readAll();
        // 进行遍历
        for (Student student1 : list) {
            // 进行判
            if(student1.getId().equalsIgnoreCase(student.getId())){
                // 进行修改
                list.remove(student1);
                // 添加学生
                list.add(student);
            }
        }
        // 添加
        DataUtil.writerAll(list);
        return true;
    }

    public boolean deletStudent(String id) {
        // 获取所有学生
        List<Student> list = DataUtil.readAll();
        // 进行遍历
        for (Student student : list) {
            // 进行判断
            if(student.getId().equalsIgnoreCase(id)){
                // 删除
                list.remove(student);
            }
        }
        // 重写写入
        DataUtil.writerAll(list);
        return true;
    }
}
