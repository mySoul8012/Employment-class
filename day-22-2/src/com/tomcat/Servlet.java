package com.tomcat;

import java.io.InputStream;
import java.io.OutputStream;

public interface Servlet {
    // 初始化方法
    public void init();
    // 服务方法
    public void service(InputStream inputStream, OutputStream outputStream) throws Exception;
    // 销毁方法
    public void destory();
}
