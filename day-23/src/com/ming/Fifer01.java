package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "Fifer01", value = "/Fifer01")
public class Fifer01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置编码
        req.setCharacterEncoding("UTF-8");
        // 获取name的值
        String name = req.getParameter("name");
        // 获取value的值
        String[] hobby = req.getParameterValues("checkbox");
        // 进行遍历
        System.out.println(name);
        System.out.println(Arrays.toString(hobby));
        // 获取全部Map集合
        Map<String, String[]>  maps = req.getParameterMap();
        // 进行遍历
        Set<String> stringSet = maps.keySet();
        // 进行遍历
        for (String s : stringSet) {
            // 获取value的值
            String[] value = maps.get(s);
            //输出
            System.out.println(s + " ");
            for (String s1 : value) {
                System.out.println(s1);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
