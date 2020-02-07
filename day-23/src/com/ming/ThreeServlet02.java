package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.ObjectInputStream;

@WebServlet(name =  "ThreeServlet", urlPatterns = "/ThreeServlet02")
public class ThreeServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取对象添加
        req.setAttribute("name", "李四");
        System.out.println("已经添加李四");
        // 获取
        Object name = req.getAttribute("name");
        // 输出
        System.out.println("获取到name " + name);
        // 修改
        req.setAttribute("name", "王五");
        // 获取值
        name = req.getAttribute("name");
        // 输出
        System.out.println("修改后的name " + name);
        // 删除
        req.removeAttribute("name");
        // 获取name
        name = req.getAttribute("name");
        // 输出
        System.out.println("删除后的name " + name);
        // 删除
        req.removeAttribute("name");
        // 获取值
        name = req.getAttribute("name");
        // 输出值
        System.out.println("删除后的值 " + name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
