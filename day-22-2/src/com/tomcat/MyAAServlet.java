package com.tomcat;

import java.io.InputStream;
import java.io.OutputStream;

public class MyAAServlet implements Servlet {
    // 创建初始化方法
    @Override
    public void init() {
        System.out.println("MyAAServlet的init方法执行了...");
    }

    @Override
    public void service(InputStream inputStream, OutputStream outputStream) throws Exception {
        System.out.println("MyAAServlet de service 方法执行了...");
        outputStream.write("MyAAServlet".getBytes());
    }

    @Override
    public void destory() {
        System.out.println("MyAAServlet de destory方法执行了。。。。");
    }
}
