package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

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
        // 设置标志位
        boolean flag = false;
        for (Cookie cookie : cookies) {
            // 进行遍历
            if(cookie.getName().equals("id")){
                // 获取cookie
                cookieTmp = cookie;
                flag = true;
                // 退出循环
                break;
            }else{
               flag = false;
            }
        }
        // 判断flag
        if(flag){
            // 如果为true，获取value值，进行输出
            // 如果cookieTmp不为空，获取value的值
            String value = cookieTmp.getValue();
            // 进行分割
            String[] strings = value.split("-");
            // 进行判断
            // 进行判断
            Writer writer = resp.getWriter();
            // 输出内容
            writer.write("历史记录为 ");
            writer.write(Arrays.toString(strings));
            writer.close();
        }else{
            // 如果为空，输出历史记录
            Writer writer = resp.getWriter();
            // 输出记录
            writer.write("找不到记录");
            writer.close();
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
