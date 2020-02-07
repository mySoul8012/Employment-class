package com.ming;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "DownLoadServlet02", urlPatterns = "/DownloadServlet02")
public class DownLoadServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取文件名称
        String name = req.getParameter("fileName");
        // 获取项目目录
        ServletContext servletContext = req.getServletContext();
        // 获取文件目录
        String fileName = servletContext.getRealPath("/WEB-INF/download/" + name);
        // 获取输入流
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ServletOutputStream servletOutputStream = resp.getOutputStream();
        // 进行文件复制
        int len = 0;
        byte[] bytes = new byte[1024];
        while((len = fileInputStream.read(bytes)) != -1){
            // 进行文件写入
            servletOutputStream.write(bytes, 0, len);
        }
        // 进行文件关闭
        servletOutputStream.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
