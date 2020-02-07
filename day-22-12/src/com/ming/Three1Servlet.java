package com.ming;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Three1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求来了...");
        // 获取单个请求头
        String userAgent = req.getHeader("User-Agent");
        // 进行打印
        System.out.println("userAgent " + userAgent);
    }
}
