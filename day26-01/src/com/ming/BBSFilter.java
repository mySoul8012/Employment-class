package com.ming;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebFilter(filterName = "BBSFilter", urlPatterns = "/bbs")
public class BBSFilter implements Filter {
    public List<String> words  = new ArrayList<String>();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 获取敏感词
        String line = "我";
        words.add(line);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }

    @Override
    public void destroy() {

    }
}
