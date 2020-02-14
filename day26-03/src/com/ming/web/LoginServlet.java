package com.ming.web;

import com.ming.domain.User;
import com.ming.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取username
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 进行判断
        // 获取session 判断是否已经登录
        HttpSession httpSession = req.getSession();
        Object flag = httpSession.getAttribute("flag");
        // 进行判断
        if(flag != null){
            // 如果此时不为空
            // 此时已经登录，输出已经登录成功
            resp.getWriter().println("登录成功");
        }
        // 如果不为空。不进行登录
        if(flag == null){
            // 如果为空，调用Service进行登录
            UserService userService = new UserService();
            User user = userService.login(username, password);
            // 进行判断
            if(user != null){
                // 如果不为空，进行登录
                resp.getWriter().println("登录成功");
                // 创建Cookie
                Cookie cookie = new Cookie("autoLogin", username + "&" + password);
                // 添加cookie
                resp.addCookie(cookie);
            }else{
                resp.getWriter().println("登录失败");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
