package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "CookieServletThree", urlPatterns = "/CookieServletTheree")
public class CookieServletTheree extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置相应编码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        // 获取用户时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy年MM月dd日HH时mm分ss秒");
        String time = simpleDateFormat.format(date);
        Cookie cookie = new Cookie("time", time);
        // 添加到cookie
        resp.addCookie(cookie);
        // 获取cookie数组
        Cookie[] cookies = req.getCookies();
        // 遍历
        for (Cookie cookie1 : cookies) {
            // 进行胖墩
            if(cookie1.getName().equals("time")){
                // 输出
                System.out.println(cookie.getValue());
            }

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
