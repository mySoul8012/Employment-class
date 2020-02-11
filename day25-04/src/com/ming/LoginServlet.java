package com.ming;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 获取用户名
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String checkbox = req.getParameter("checkbox");
        //  判断用户名密码
        if(password != null){
            // 记住用户名
            // 进行判断
            if(checkbox != null){
                // 此时记住用户名
                Cookie cookie = new Cookie("username", username);
                Cookie cookie1 = new Cookie("password", password);
                // 进行添加
                resp.addCookie(cookie);
                resp.addCookie(cookie1);
            }
            // 进行页面跳转
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/index01.jsp");
            requestDispatcher.forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
