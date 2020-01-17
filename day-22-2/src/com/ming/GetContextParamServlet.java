package com.ming;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class GetContextParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取ServletContext
        ServletContext servletContext = getServletContext();
        // 添加键值对
        servletContext.setAttribute("name", "北京");
        // 获取键值对
        String name = (String)servletContext.getAttribute("name");

    }
}
