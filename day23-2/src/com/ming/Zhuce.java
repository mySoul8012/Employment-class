package com.ming;

import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.im.InputContext;
import java.io.*;
import java.util.Properties;

@WebServlet(name = "Zhuce", urlPatterns = "/zhuce")
public class Zhuce extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取跟路径
        ServletContext servletContext = req.getServletContext();
        // 获取全文路径
        String path = "C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day23-2\\web\\WEB-INF\\info.properties";
        // 获取输出流
        OutputStream outputStream = new FileOutputStream(path);
        // 创建Properties
        Properties properties = new Properties();
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        // 获取名称
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String sex = req.getParameter("radio");
        // 进行保存
        properties.setProperty(name, password);
        // 进行写入
        properties.store(outputStream, "mingming");
        // 关闭流
        outputStream.close();
        // 创建输出流
        resp.setContentType("text/html;charset=UTF-8");
        // 写入数据
        Writer writer = resp.getWriter();
        // 写入数据
        writer.write("数据写入");
        // 关闭
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
