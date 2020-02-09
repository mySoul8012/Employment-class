package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionServletTwo", urlPatterns = "/sessionServletTwo")
public class SessionServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 获取session
        HttpSession httpSession = req.getSession();
        // 获取session的值
        Object value = httpSession.getAttribute("xiaoxiao");
        // 进行输出
        resp.getWriter().println(value);
        // 从session中删除数据
        httpSession.removeAttribute("xiaoxiao");
        // 再次获取
        value = httpSession.getAttribute("xiaoxiao");
        // 输出
        System.out.println(value);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
