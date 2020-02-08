package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(name = "BookHistory", urlPatterns = "/BookHistory")
public class BookHistory extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应提和请求体的编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 获取cookie
        Cookie[] cookies = req.getCookies();
        // 进行遍历
        Cookie cookieTmp = null;
        for (Cookie cookie : cookies) {
            // 进行遍历
            if("id".equals(cookie.getName())){
                // 获取cookie
                cookieTmp = cookie;
            }else{
                // 获取writer
                Writer writer = resp.getWriter();
                // 输出结果
                writer.write("系统找不到记录");
                writer.close();
            }
        }
        // 获取到cookieTmp
        // 再次判断cookieTmp是否为空
        if(cookieTmp != null){
            // 如果cookieTmp不为空，获取value的值
            String value = cookieTmp.getValue();
            // 进行分割
            String[] strings = value.split("-");
            // 进行判断
            // 进行判断
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
