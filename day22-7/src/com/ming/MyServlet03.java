package com.ming;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class MyServlet03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取全局域对象
        ServletContext servletContext = getServletContext();
        // 进行添加
        // 获取
        Object number = servletContext.getAttribute("numbers");
        // 进行判断
        if(number == null){
            // 进行添加
            servletContext.setAttribute("numbers", 1);
        }else{
            // 获取原有的值，进行加加操作
            Integer num = (Integer)number;
            servletContext.setAttribute("numbers", num);
        }
        // 进行输出打印
        Writer writer = resp.getWriter();
        writer.write("打印的结果为 " + servletContext.getAttribute("numbers"));
        writer.flush();
    }
}
