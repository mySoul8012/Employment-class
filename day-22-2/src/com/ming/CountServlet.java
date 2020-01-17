package com.ming;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取全局对象
        ServletContext servletContext = getServletContext();
        // 获取number
        Object number = servletContext.getAttribute("number");
        // 进行判断
        if(number == null){
            servletContext.setAttribute("number", 1);
        }else{
            Integer num = (Integer)number;
            servletContext.setAttribute("number", num + 1);
        }
        // 输出
        resp.getWriter().println("welcome to our!!" + number);
    }
}
