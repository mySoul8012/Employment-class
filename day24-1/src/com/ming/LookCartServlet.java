package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Key;
import java.util.*;

@WebServlet(name = "LookCartServlet", urlPatterns = "/lookCartServlet")
public class LookCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置响应体
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        HttpSession httpSession = req.getSession();
        // 取出商品集合
        Object names = httpSession.getAttribute("names");
        // 商品输出给浏览器
        // 创建集合
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        // 进行遍历集合
        List<String> product = (List<String>)names;
        // 进行遍历
        for (String s : product) {
            // 进行遍历
            // 取出value的值
            Integer integer = hashMap.get(s);
            // 进行判断
            if(integer == null){
                // 进行put
                hashMap.put(s, 1);
            }else{
                integer++;
                // 进行put
                hashMap.put(s, integer);
            }
        }
        // 进行输出
        Set<String> set = hashMap.keySet();
        // 进行遍历
        for (String s : set) {
            // 进行输出
            resp.getWriter().println(s);
            resp.getWriter().println(hashMap.get(s));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
