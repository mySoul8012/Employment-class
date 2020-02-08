package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet(name = "CookieServletFor", urlPatterns = "/CookieServletFor")
public class CookieServletFor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应提
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 创建cookie
        String time = URLEncoder.encode("mingming;;;;3234erf", "UTF-8");
        // 创建cookie
        Cookie cookie = new Cookie("time", time);
        // 添加cookie
        resp.addCookie(cookie);
        // 获取cookie
        Cookie[] cookies = req.getCookies();
        // 进行遍历
        for (Cookie cookie1 : cookies) {
            if("time".equals(cookie1.getName())){
                // 获取cookie值
                System.out.println(cookie1.getName());
                System.out.println(URLDecoder.decode(cookie1.getValue()));
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
