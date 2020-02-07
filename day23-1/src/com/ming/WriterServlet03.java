package com.ming;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WriterServlet03", urlPatterns = "/WriterServlet03")
public class WriterServlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // 设置相应类型
        resp.setContentType("text/html;charset=UTF-8");
        // 获取输出流
        PrintWriter printWriter = resp.getWriter();
        // 进行输出
        printWriter.println("HelloWorld");
        ServletOutputStream servletOutputStream = resp.getOutputStream();
        // 进行输出
        servletOutputStream.write("HelloWorld".getBytes());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
