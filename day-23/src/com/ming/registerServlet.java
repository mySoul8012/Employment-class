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
public class registerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取用户名
        String username = req.getParameter("username");
        // 获取爱好
        String[] hobbies = req.getParameterValues("hobby");
        // 进行输出
        System.out.println("注册的爱好 " + Arrays.toString(hobbies));
        // 获取Map集合
        Map<String, String[]> map = req.getParameterMap();
        // 进行输出
        System.out.println("注册的所有数据 " + map);
    }
}
