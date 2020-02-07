package com.ming;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="DownloadServlet", urlPatterns = "/download")
public class DowloadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 输出
        System.out.println("用户想要下载的视频");
        String referer = req.getHeader("Referer");

        if(referer == null || referer.startsWith("http://127.0.0.1:8080/day2301")){
            System.out.println("可以下载!");
        }else{
            System.out.println("您下载的地址是其他人盗链的，不给下载");
        }
    }
}

