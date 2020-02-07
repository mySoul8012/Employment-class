package com.ming;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求头
        String refer = req.getHeader("Referer");
        // 进行判断
        if(refer != null || refer.startsWith("http://127.0.0.1:8080")){
            System.out.println("可以下载");
        }else{
            System.out.println("下载链接为倒链的");
        }

    }
}
