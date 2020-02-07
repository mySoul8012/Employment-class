package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name="TwoServlet", urlPatterns = "/two")
public class TwoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求来了");
        // 获取单个请求头
        String userAgent = req.getHeader("User-Agent");
        String referer = req.getHeader("Referer");
        System.out.println("userAgent " + userAgent);
        System.out.println("referer " + referer);
        // 获取所有请求头
        Enumeration<String> headerNames = req.getHeaderNames();
        // 进行迭代器迭代
        while(headerNames.hasMoreElements()){
            String header = headerNames.nextElement();
            System.out.println(header);
        }
    }
}
