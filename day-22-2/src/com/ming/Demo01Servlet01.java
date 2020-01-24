package com.ming;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Demo01Servlet01", urlPatterns = "/demo01Servlet01")
public class Demo01Servlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取Context集合
        ServletContext servletContext = getServletContext();
        // 获取集合
        Object object = servletContext.getAttribute("ips");
        // 创建返回类型
        resp.setContentType("text/html;charset=utf-8");
        // 进行判断
        if(object != null){
            // 如果不为空，进行强制类型转换
            List<String> list = (List<String>)object;
            // 进行添加
            list.add(req.getLocalAddr());
            // 进行返回设置
            servletContext.setAttribute("ips", list);
            // 输出结果
            resp.getWriter().println("总数为 " + list.size());
        }else{
            // 如果为空，进行重新设置
            servletContext.setAttribute("ips", new ArrayList<String>());
        }
        // 输出添加完成
        resp.getWriter().println("添加完成");
    }
}
