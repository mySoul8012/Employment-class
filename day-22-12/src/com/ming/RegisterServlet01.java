package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("用户注册了...");
        // 获取用户名
        String username = req.getParameter("username");
        // 进行注册用户名
        System.out.println("注册用户名 " + username);
        // 获取爱好
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println("注册的爱好 " + Arrays.toString(hobbies));
        // 获取所有的数据，返回map集合
        Map<String, String[]> map = req.getParameterMap();
        System.out.println("注册所有的数据 " + map);
    }
}
