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

@WebServlet(name = "DownLoadServlet", urlPatterns = "/downLoadServlet")
public class DownLoadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取用户下载的文件名
        String fileName = req.getParameter("fileName");
        // 输出用户要下载什么
        System.out.println("用户要下载 " + fileName);
        resp.setHeader("Content-Disposition", "attachment;filename=" + fileName);
        // 获取真实路径
        ServletContext servletContext = getServletContext();
        // 获取路径
        String realPath = servletContext.getRealPath("/WEB-INF/download/" + fileName);
        // 输出路径
        System.out.println("文件真实路径" + realPath);
        // 创建文件字节输入流
        FileInputStream fileInputStream = new FileInputStream(realPath);
        // 获取字节输出流，流向浏览器
        ServletOutputStream servletOutputStream = resp.getOutputStream();
        // 进行文件复制
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fileInputStream.read(bytes)) != -1){
            servletOutputStream.write(bytes, 0, len);
        }
        // 进行资源释放
        fileInputStream.close();
        servletOutputStream.close();
        System.out.println("文件发送完毕");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
