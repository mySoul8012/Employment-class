package com.ming;

import javafx.scene.control.skin.SliderSkin;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// 用于记录访问本网站的客户端的ip
@WebServlet(name = "Demo1Servlet", urlPatterns = "/demo1Servlet")
public class Demo1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建客户端的ip
        ServletContext servletContext = getServletContext();
        // 获取值
        Object object = servletContext.getAttribute("ips");
        resp.setContentType("text/html;charset=utf-8");
        // 进行判断
        if(object != null){
            // 此时已经创建，进行添加
            List<String> list = (List<String>)object;
            // 进行添加
            list.add(req.getLocalAddr());
            // 进行重新添加
            servletContext.setAttribute("ips", list);
            resp.getWriter().println(list.size());
        }else{
            // 如果不存在，进行添加
            servletContext.setAttribute("ips", new ArrayList<String>());
        }
        // 输出结果
        resp.getWriter().println("添加结果完成");
    }
}
