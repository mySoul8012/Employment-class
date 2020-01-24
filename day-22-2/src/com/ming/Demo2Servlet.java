package com.ming;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

@WebServlet(name = "Demo2Servlet", urlPatterns = "/Demo2Servlet")
public class Demo2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取Context
        ServletContext servletContext = getServletContext();
        // 获取值
        Object object = servletContext.getAttribute("ips");
        List<String> list = (List<String>) object;
        // 创建输出流
        resp.setContentType("text/html;charset=utf-8");
        // 输出结果
        Iterator<String> integer = list.iterator();
        while(integer.hasNext()){
            resp.getWriter().println((String)integer.next());
        }
    }
}
