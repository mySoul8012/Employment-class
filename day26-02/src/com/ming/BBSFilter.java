package com.ming;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(filterName = "BBSFilter", urlPatterns = "/bbs")
public class BBSFilter implements Filter {
    // 保存数组
    List<String> list = new ArrayList<>();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //读取敏感词
        String mingganci = "我";
        // 进行添加
        list.add(mingganci);

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 进行强制类型转换
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse)servletResponse;
        // 设置响应提编码，防止出现乱码
        httpServletRequest.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        // 获取username值
        String username = httpServletRequest.getParameter("message");
        // 进行判断
        for (String s : list) {
            // 进行胖墩啊
            if(username.contains(s)){
                // 不合法，进行替换
                httpServletRequest.setAttribute("message", "***");
                // 输出值
                httpServletResponse.getWriter().println("您的言论不合法");
                // 直接返回，不放心
                return;
            }
        }
        // 合法，进行放行操作
        filterChain.doFilter(httpServletRequest, httpServletResponse);

    }

    @Override
    public void destroy() {

    }
}
