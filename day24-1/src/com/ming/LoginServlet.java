package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应提
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 获取用户登录时的信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 获取code
        String code = req.getParameter("code");
        // 从session中获取code
        HttpSession httpSession = req.getSession();
        // 获取session
        String code1 = (String)httpSession.getAttribute("code");
        // 进行判断
        if(code.equalsIgnoreCase(code1)){
            // 进行页面跳转
            req.getRequestDispatcher("/success.html").forward(req, resp);
        }else{
            // 验证码失败，重新跳转回
            resp.setStatus(302);
            resp.sendRedirect("/");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
