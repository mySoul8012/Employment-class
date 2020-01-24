package com.tomcat;

import java.io.InputStream;
import java.io.OutputStream;

public class MyBBServlet implements Servlet {
    @Override
    public void init() {
        System.out.println("MyBBServlet 的init方法执行了");
    }

    @Override
    public void service(InputStream inputStream, OutputStream outputStream) throws Exception {
        System.out.println("MyBBServlet de service 方法执行了");
        outputStream.write("MyBBServlet".getBytes());
    }

    @Override
    public void destory() {
        System.out.println("MyBBServlet de destory 方法执行了...");
    }
}
