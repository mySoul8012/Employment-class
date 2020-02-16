package com.ming.web.servlet;

import com.ming.domain.Student;
import com.ming.service.StudentServiuce;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddStudent", urlPatterns = "/AddStudent")
public class AddStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建service
        StudentServiuce studentServiuce = new StudentServiuce();
        // 获取值
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String age = req.getParameter("age");
        // 创建Student对象
        Student student = new Student();
        student.setAge(age);
        student.setSex(sex);
        student.setName(name);
        student.setId(id);
        // 添加对象
        studentServiuce.addStudent(student);
        // 输出结果
        resp.getWriter().println("添加成功");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
