package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;

@WebServlet(name = "ThreeServlet03", urlPatterns = "/ThreeServlet03")
public class ThreeServlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取对象添加
        req.setAttribute("ming", "ming");
        // 获取对象
        Object ming = req.getAttribute("ming");
        // 输出
        System.out.println(ming);
        // 修改
        req.setAttribute("ming", "ming2");
        // 获取对象
        ming = req.getAttribute("ming");
        // 输出值
        System.out.println(ming);
        // 删除值
        req.removeAttribute("ming");
        // 获取值
        ming = req.getAttribute("ming");
        // 输出值
        System.out.println(ming);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
