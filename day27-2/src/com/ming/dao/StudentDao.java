package com.ming.dao;

import com.ming.domain.Student;
import com.ming.util.DataUtil;

import javax.xml.crypto.Data;
import java.awt.dnd.DragGestureEvent;
import java.io.IOException;
import java.util.List;

public class StudentDao {
    // 增加
    public boolean addStudent(Student student) throws IOException {
        // 获取全部学生
        List<Student> list = DataUtil.readAll();
        // 获取全部学生
        list.add(student);
        // 进行文件写入
        DataUtil.writeAllStudent(list);
        // 返回值
        return true;
    }

    // 修改
    public boolean updateStudent(Student student) throws IOException {
        // 获取全部学生
        List<Student> list = DataUtil.readAll();
        //获取全部学生
        for (Student student1 : list) {
            // 进行判断
            if(student1.equals(student)){
                // 如果此时相同，进行修改
                student1.setId(student.getId());
                student1.setName(student.getName());
                student1.setAge(student.getAge());
                student1.setSex(student.getSex());
                // 返回true
                return true;
            }
        }
        // 进行重新写入
        DataUtil.writeAllStudent(list);
        // 返回false
        return false;
    }

    // 删除
    public boolean deletStudent(Student student) throws IOException {
        // 获取全部学生
        List<Student> list = DataUtil.readAll();
        //获取全部学生
        for (Student student1 : list) {
            // 进行判断
            if(student1.equals(student)){
                // 进行删除
                list.remove(student1);
                return true;
            }
        }
        DataUtil.writeAllStudent(list);
        // 返回false
        return false;
    }
    // 查询，根据id查询Student
    public Student findStudent(String id) throws IOException {
        // 获取学生列表
        List<Student> list = DataUtil.readAll();
        //进行判断
        for (Student student : list) {
            // 进行判断
            if(student.getId().equalsIgnoreCase(id)){
                // 进行返回
                return student;
            }
        }
        return null;
    }

    // 获取全部
    public List<Student> findAllStudent() throws IOException {
        StudentDao studentDao = new StudentDao();
        List<Student> list = DataUtil.readAll();
        // 进行返回
        return list;
    }
}
