package com.ming.service;

import com.ming.dao.StudentDao;
import com.ming.domain.Student;

import java.io.IOException;
import java.util.List;

public class StudentService {
   // 增加
   public boolean addStudent(Student student) throws IOException {
       StudentDao studentDao = new StudentDao();
       // 增加
       return studentDao.addStudent(student);
   }

   // 删除
    public boolean delete(Student student) throws IOException {
       // 获取Dao
        StudentDao studentDao = new StudentDao();
        // 删除
        return studentDao.deletStudent(student);
    }

    // 查询
    public Student findStudent(String id) throws IOException {
       StudentDao studentDao = new StudentDao();
       // 获取
        return studentDao.findStudent(id);
    }

    // 查询全部
    public List<Student> findAllStudent() throws IOException {
       return new StudentDao().findAllStudent();
    }

    // 更改
    public boolean updateStudent(Student student) throws IOException {
       return new StudentDao().updateStudent(student);
    }
}
