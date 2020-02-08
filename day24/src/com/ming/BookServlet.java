package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BookServlet", urlPatterns = "/BookServlet")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置相应编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 创建cookie
        Cookie[] cookies = req.getCookies();
        // 遍历获取idcookie
        Cookie cookie = null;
        // 进行遍历
        for (Cookie cookie1 : cookies) {
            // 进行遍历，获取值
            if(cookie1.getName().equals("id")){
                cookie = cookie1;
            }
        }
        // 进行判断
        if(cookie == null){
            // 如果为空，进行遍历
            String id = req.getParameter("id");
            // 创建Cookie
            Cookie cookie1 = new Cookie("id", id);
            // 数据写入
            resp.addCookie(cookie1);
        }else{
            // 如果不为空，获取cookie的值
            String id = req.getParameter("id");
            // 获取cookie的value的值
            id = id + "-" + cookie.getValue();
            // 重写创建cookie
            Cookie cookie1 = new Cookie("id", id);
            // 写入数据
            resp.addCookie(cookie1);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
