package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OneServlet", urlPatterns = "/one")
public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求来了" + req.getMethod());
        System.out.println("getRequestURL" + req.getRequestURL());
        System.out.println("getRequestURI" + req.getRequestURI());
        System.out.println("getContextPath" + req.getContextPath());
        System.out.println("getProtocol" + req.getProtocol());
        System.out.println("getRemoteAddr" + req.getRemoteAddr());
        System.out.println("getLocalPort" + req.getLocalPort());

    }
}
