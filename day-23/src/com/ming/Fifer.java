package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Style;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "Fifer", urlPatterns = "/Fifer")
public class Fifer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        // 获取用户名
        String username = req.getParameter("name");
        // 获取爱好
        String[] checkbox = req.getParameterValues("hobby");
        // 进行输出
        System.out.println("用户名为 " + username);
        // 输出爱好
        System.out.println("爱好为 " + Arrays.toString(checkbox));
        // 获取全部map集合
        Map<String, String[]> maps = req.getParameterMap();
        // 进行遍历
        System.out.println("全部的map为 " + maps);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
