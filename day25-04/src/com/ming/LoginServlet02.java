package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogoinServlet02", urlPatterns = "/LoginServlet02")
public class LoginServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        // 获取session
        HttpSession httpSession = req.getSession();
        // 获取session的值
        String token01 = httpSession.getAttribute("token") + "";
        //获取表单中的token
        String token = req.getParameter("token");
        // 进行比较
        if(token01 != null){
            if(token.equals(token01)){
                // 进行判断
                // 此时为不重复提交
                System.out.println(req.getParameter("username"));
                System.out.println(req.getParameter("password"));
                // 输出值
                resp.getWriter().println("成功登陆");
                // 清楚session
                httpSession.removeAttribute("token");
            }else{
                resp.getWriter().println("登陆失败");
            }
        }else{
            resp.getWriter().println("登陆失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
