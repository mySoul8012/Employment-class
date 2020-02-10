package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.UUID;

@WebServlet(name = "AddUser", urlPatterns = "/AddUser")
public class AddUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 生成UUID
        UUID uuid = UUID.randomUUID();
        String token = uuid.toString();
        // 打印token
        System.out.println(token);
        // 获取session
        HttpSession httpSession = req.getSession();
        // 添加session
        httpSession.setAttribute("token", token);
        // 添加token
        req.setAttribute("token", token);
        // 进行转发
        req.getRequestDispatcher("/WEB-INF/addUser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
