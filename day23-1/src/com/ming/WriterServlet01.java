package com.ming;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WriterServlet01", urlPatterns = "/WriterServlet01")
public class WriterServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 使用字节输出流
        ServletOutputStream servletOutputStream = resp.getOutputStream();
        // 进行输出
        servletOutputStream.write("HelloWorld".getBytes());
        // 使用字节输出流
        PrintWriter printWriter = resp.getWriter();
        // 输出数据
        printWriter.println("HelloWorld");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
