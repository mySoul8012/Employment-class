package com.ming.web.servlet;

import com.ming.domain.Student;
import com.ming.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Delete", urlPatterns = "/Delete")
public class Delete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取id
        String id = req.getParameter("id");
        // 获取Student
        Student  student = new StudentService().findStudent(id);
        // 进行删除
        boolean b = new StudentService().delete(student);
        req.setAttribute("isOK", b?"删除成功":"删除失败");
        // 进行跳转
        req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
