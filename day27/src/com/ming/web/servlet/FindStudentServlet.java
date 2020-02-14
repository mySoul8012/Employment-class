package com.ming.web.servlet;

import com.ming.domain.Student;
import com.ming.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "FindStudentServlet",urlPatterns = "/findStudent")
public class FindStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求中的参数
        String id = req.getParameter("id");
        // 调用Service
        StudentService studentService = new StudentService();
        Student student = studentService.findStudent(id);
        // 保存到域对象
        req.setAttribute("student", student);
        // 进行转发
        req.getRequestDispatcher("/edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
