package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "AddUserUser", urlPatterns = "/AddUserUser")
public class AddUserUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        // 获取用户
        String username = req.getParameter("username");
        // 获取密码
        String password = req.getParameter("password");
        // 获取token
        String token = req.getParameter("token");
        // 获取session
        HttpSession httpSession = req.getSession();
        // 获取session中的token
        String tokenYanzheng = (String)httpSession.getAttribute("token");
        // 进行比较
        // 进行判空
        if(token != null){
            // 进行比较
            if(token.equals(tokenYanzheng)){
                // 此时相同，进行添加
                String name = req.getParameter("username");
                String password1 = req.getParameter("password");
                // 进行打印
                System.out.println(name + password1);
            }else{
                resp.getWriter().println("添加失败!");
            }
        }else{
            resp.getWriter().println("添加失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
