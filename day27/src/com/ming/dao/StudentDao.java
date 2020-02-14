package com.ming.dao;

import com.ming.domain.Student;
import com.ming.util.DataUtil;

import java.io.IOException;
import java.util.List;

public class StudentDao {
    public List<Student> findAllStudents(){
        // 获取文件中要查询的数据
        List<Student> studentList = DataUtil.readAll();
        // 返回
        return studentList;
    }

    public boolean addStudent(Student student) throws IOException {
        // 获取所有学生
        List<Student> studentList = DataUtil.readAll();
        // 添加到集合中
        studentList.add(student);
        // 写入到文件中
        DataUtil.writeAll(studentList);
        // 返回成功
        return true;

    }

    // 删除学生
    public boolean deleteStudent(String id) throws IOException {
        List<Student> studentList = DataUtil.readAll();
        // 根据Id从集合students吧学生删除
        for(Student student:studentList){
            // 进行判断
            if(student.getId().equals(id)){
                studentList.remove(student);
                break;
            }
        }
        // 删除后写入到文件
        DataUtil.writeAll(studentList);
        // 返回成功
        return true;
    }

    public Student findStudent(String id) {
        // 从文件中查询指定的id的信息
        List<Student> studentList = DataUtil.readAll();
        // 查询指定id的学生
        for(Student student:studentList){
            // 进行判断
            if(student.getId().equalsIgnoreCase(id)){
                return student;
            }
        }
        // 如果未找到返回null
        return null;
    }

    public boolean updateStudent(Student s) throws IOException {
        // 获取所有学生
        List<Student> studentList = DataUtil.readAll();
        // 修改
        for(Student student:studentList){
            // 判断
            if(student.getId().equalsIgnoreCase(s.getId())){
                // 修改
                student.setName(s.getName());
                student.setAge(s.getAge());
                student.setSex(s.getSex());
            }
        }
        // 重新写入
        DataUtil.writeAll(studentList);
        // 返回结果
        return true;
    }
}
