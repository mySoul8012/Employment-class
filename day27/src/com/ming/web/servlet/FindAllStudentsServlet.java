package com.ming.web.servlet;

import com.ming.domain.Student;
import com.ming.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name = "FindAllStudentsServlet",urlPatterns = "/findAllStudents")
public class FindAllStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 调用Service 获取学生信息
        StudentService studentService = new StudentService();
        // 获取学生对象
        List<Student> studentList = studentService.findAllStudents();
        // 保存到域对象
        req.setAttribute("students", studentList);
        // 进行另外一个转发
        req.getRequestDispatcher("/list.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
