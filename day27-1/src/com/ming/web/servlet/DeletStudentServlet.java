package com.ming.web.servlet;

import com.ming.service.StudentServiuce;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeletStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求参数
        String id = req.getParameter("id");
        // 调用Service
        StudentServiuce studentServiuce = new StudentServiuce();
        // 删除学生
        boolean b = studentServiuce.deleteStudent(id);
        // 保存域对象
        req.setAttribute("isOk", b?"删除功能":"删除失败");
        // 进行转发
        req.getRequestDispatcher("/findAllStudents").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req ,resp);
    }
}
