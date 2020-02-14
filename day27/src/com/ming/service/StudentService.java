package com.ming.service;

import com.ming.dao.StudentDao;
import com.ming.domain.Student;

import java.io.IOException;
import java.util.List;

public class StudentService {
    // 获取所有学生方法
    public List<Student> findAllStudents(){
        // 调用dao
        StudentDao dao  = new StudentDao();
        // 进行获取
        List<Student> studentList = dao.findAllStudents();
        // 返回
        return studentList;
    }

    // 添加学生方法
    public boolean addStudent(Student s) throws IOException {
        // 调用Dao
        StudentDao studentDao = new StudentDao();
        // 添加学生
        boolean b = studentDao.addStudent(s);
        // 返回
        return b;
    }

    // 根据id删除学生
    public boolean deleteStudent(String id) throws IOException {
        // 调用到
        StudentDao studentDao = new StudentDao();
        // 进行删除
        boolean b = studentDao.deleteStudent(id);
        return b;
    }

    // 根据id查询学生
    public Student findStudent(String id){
        // 调用dao
        StudentDao dao = new StudentDao();
        Student s = (Student) dao.findStudent(id);
        // 返回s
        return s;
    }

    // 修改学生
    public boolean updateStudent(Student s) throws IOException {
        // 调用Dao
        StudentDao dao = new StudentDao();
        boolean b = dao.updateStudent(s);
        //进行判断
        if(b){
            return true;
        }else{
            return false;
        }
    }
}
