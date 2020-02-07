package com.ming;

import com.utils.DownloadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(name = "DownLoadServlet01", urlPatterns = "/downloadServlet01")
public class DownLoadServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取文件名称
        String fileName = req.getParameter("fileName");
        // 获取系统路径
        ServletContext servletContext = getServletContext();
        // 拼接生成完整路径
        fileName = servletContext.getRealPath("/WEB_INF/download/" + fileName);
        // fileName重新生成
        String newfileName = DownloadUtils.getName(req.getHeader("User-Agent"), fileName);
        resp.setHeader("Content-Disposition", "attachment;filename=" + newfileName);
        // 输出完整路径
        System.out.println("文件真实路径 " + fileName);
        // 创建文件字节输入流
        FileInputStream fileInputStream = new FileInputStream(fileName);
        // 创建输出流
        ServletOutputStream servletOutputStream = resp.getOutputStream();
        // 进行文件输出
        int len = 0;
        byte[] bytes = new byte[1024];
        // 进行文件输出
        while((len = fileInputStream.read(bytes)) != -1){
            // 进行文件写入
            servletOutputStream.write(bytes, 0, len);
        }
        // 资源释放
        fileInputStream.close();
        System.out.println("文件发送完毕");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
