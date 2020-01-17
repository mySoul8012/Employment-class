package com.ming;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetContextParmServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过ServletContext域对象获取配置文件中全局项目的配置信息
        ServletContext servletContext = getServletContext();
        // 获取信息
        String vale = servletContext.getInitParameter("Encoding");
        // 进行打印
        System.out.println("Encoding = " + vale);
    }
}
