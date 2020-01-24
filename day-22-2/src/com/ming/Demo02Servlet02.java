package com.ming;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@WebServlet(name = "Demo02Servlet02", urlPatterns = "/demo02Servlet02")
public class Demo02Servlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取值
        ServletContext servletContext = getServletContext();
        // 获取
        Object object = servletContext.getAttribute("ips");
        resp.setContentType("text/html;charset=utf-8");
        // 进行强制类型转换
        List<String> list = (List<String>)object;
        // 进行输出
        Iterator<String> integer = list.iterator();
        // 进行输出
        while(integer.hasNext()){
            // 进行输出
            resp.getWriter().println("访问的ip " + integer.next());
        }
    }
}
