package com.ming;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "toLoginUiServlet", urlPatterns = "/toLoginUiServlet")
public class toLoginUiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 获取cookie值
        Cookie[] cookies = req.getCookies();
        String username = null;
        String password = null;
        // 进行遍历
        for (Cookie cookie : cookies) {
            // 进行判断
            if(cookie.getName().equals("username")){
                // 获取到username
                username = cookie.getValue();
            }
            // 进行判断密码
            if(cookie.getName().equals("password")){
                // 获取password
                password = cookie.getValue();
            }
        }
        // 判断是否为空
        if(username != null){
            // 添加进入
            req.setAttribute("username", username);
        }else{
            req.setAttribute("username", "");
        }
        if(password != null){
            req.setAttribute("password", password);
        }else{
            req.setAttribute("password", "");
        }
        // 设置跳转
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/login.jsp");
        // 进行跳转
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
