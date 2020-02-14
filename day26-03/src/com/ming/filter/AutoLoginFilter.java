package com.ming.filter;

import com.ming.domain.User;
import com.ming.service.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AutoLoginFilter", urlPatterns = "/*")
public class AutoLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        // 设置编码
        httpServletRequest.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        // 获取session
        HttpSession session = httpServletRequest.getSession();
        // 获取flag
        Object flag = session.getAttribute("flag");
        Cookie cookie1 = null;
        // 进行判断
        if(flag == null){
            // 如果flag为空
            // 获取cookie
            Cookie[] cookies = httpServletRequest.getCookies();
            // 进行遍历
            for (Cookie cookie : cookies) {
                // 进行遍历操作
                if(cookie.getName().equalsIgnoreCase("autoLogin")){
                    // 如果cookie相同。进行赋值
                    cookie1 = cookie;
                }
            }
            // 再次判断cookie是否为空
            if(cookie1 != null){
                // 此时获取username
                // 进行分割
                String[] tmp = cookie1.getValue().split("&");
                // 获取username
                String username = tmp[0];
                String password = tmp[1];
                // 执行登录逻辑
                UserService userService = new UserService();
                // 执行登录逻辑
                User user = userService.login(username, password);
                // 进行判断
                if(user == null){
                    // 如果user为空。进行登录 保存进入session
                    session.setAttribute("flag", "true");
                }
                // 此时自动登录完成
                return;
            }
        }
        // 进行放行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
