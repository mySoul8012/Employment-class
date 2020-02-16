package com.ming.service;

import com.ming.dao.StudentDao;
import com.ming.domain.Student;

import java.util.List;

public class StudentServiuce {
    public List<Student> findAllStudent(){
        // 从dao层获取ListStudent
        List<Student> list = new StudentDao().findAllStudents();
        // 返回
        return list;
    }

    //添加学生
    public boolean addStudent(Student student){
        // 从dao层获取ListStudent
        return new StudentDao().addStudent(student);

    }

    public boolean deleteStudent(String id) {
        // 删除学生
        return new StudentDao().deletStudent(id);
    }
}
