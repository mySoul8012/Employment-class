package com.ming;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Properties;

@WebServlet(name = "Login", urlPatterns = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // 创建输入流
        String path = "C:\\Users\\Administrator\\IdeaProjects\\untitled6\\day23-2\\web\\WEB-INF\\info.properties";
        InputStream inputStream = new FileInputStream(path);
        // 创建properties
        Properties properties = new Properties();
        // 进行装载
        properties.load(inputStream);
        // 获取浏览器端传来的用户名
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        // 进行判空
        if(name.isEmpty() || password.isEmpty()){
            // 创建写回
            Writer writer = resp.getWriter();
            writer.write("输入错误，几秒钟后跳转");
            // 创建跳转回登录页面
            resp.sendRedirect("login.html");
            // 设置响应值
        }
        // 如果不为空，进行判断
        // 取出密码
        String password01 = properties.getProperty(name);
        // 进行比较
        if(password.equals(password01)){
            // 返回登录成功
            Writer writer = resp.getWriter();
            writer.write("登录成功");
            // 转发请求到登录页面
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/Success");
            // 进行转发
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
