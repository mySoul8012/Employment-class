package com.ming.web.servlet;

import com.ming.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteStudentServlet", urlPatterns = "/deleteStudent")
public class DeleteStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        // 获取参数
        String id = req.getParameter("id");
        // 调用service
        StudentService studentService = new StudentService();
        boolean b = studentService.deleteStudent(id);
        // 保存到域对象
        req.setAttribute("idOK", b?"删除功能":"删除失败");
        // 进行请求转发
        req.getRequestDispatcher("/findAllStudents").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
