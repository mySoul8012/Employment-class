package com.ming;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login", urlPatterns = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 获取登录的参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 获取勾选框的值
        String remember = req.getParameter("remember");
        System.out.println(req.getContextPath());
        // 获取值进行判断
        if("on".equals(remember)){
            // 此时勾选框以及勾选，进行添加cookie
            Cookie cookie = new Cookie("username", username);
            // 设置路径
            cookie.setPath("/toLoginUiServlet");
            // 进行添加
            resp.addCookie(cookie);
            cookie = new Cookie("password", password);
            // 设置路径
            cookie.setPath("/toLoginUiServlet");
            // 进行添加
            resp.addCookie(cookie);
        }
        // 进行判断密码
        if("ming".equals(username) && "ming".equals(password)){
            // 进行跳转
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/success.jsp");
            // 添加用户名，密码
            req.setAttribute("username", username);
            req.setAttribute("password", password);
            // 进行跳转
            requestDispatcher.forward(req, resp);
        }else{
            // 进行跳转失败页面
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/error.jsp");
            // 进行跳转
            requestDispatcher.forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
