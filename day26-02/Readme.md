# 题目1
以下关于过滤器的执行流程的说法，正确的是（）

A.当浏览器访问服务器资源时，过滤器执行init方法拦截请求。
B.过滤器调用FilterChain放行，请求访问资源。
C.资源发送响应给浏览器不需要经过过滤器。
过滤器获取资源响应数据后将响应数据发送给浏览器。
BD

# 题目2
（单选）下面关于filter的选项，正确的是：（）
A.默认情况下，filter的启动时间跟servlet一样 
B.Filter在每次访问时创建，访问完毕后销毁
C.Filter可以对到达servlet之前的请求进行统一处理
D.Filter是对对servlet的封装，功能比servlet强大 

答案： C

# 题目4
分析下面代码，选择正确的选择：（）
```angular2html
public class QuickFilter implements Filter {
    public void destroy() {
        System.out.println("destory");
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws 
IOException, ServletException {
        System.out.println("doFilter");
        chain.doFilter(request, response);
    }
    public void init(FilterConfig fConfig) throws ServletException {
        System.out.println("init");
    }
}
```
A.这是一个自定义Filter类
B.每次请求时都会执行init方法做一些初始化操作
C.每次请求时都会执行doFilter方法做一些统一的请求处理操作
D.每次请求完毕后都会调用destory方法，做一些统一操作，如释放资源 
答案 AC

# 题目5
（单选）以下是在test项目下的一个过滤器的注解和doFilter方法代码，访问
```angular2html
@WebFilter("/admin/*")
public class AdminFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("触发了过滤器");
		chain.doFilter(request, response);
	}
}
```
以下哪个路径会触发该过滤器在控制台输出内容（）

A.http://localhost:8080/test/admin.html.
B.http://localhost:8080/admin/index.html
C.http://localhost:8080/test/index.html
D.http://localhost:8080/test/admin/index.html

答案 D

# 题目6
2.（单选）以下是在test项目下的一个过滤器的注解和doFilter方法代码，现依次访问该项目下index.html, index.jsp, Index.jsp，请问控制台中会输出多少个“你好呀”（）
```angular2html
@WebFilter("/index.jsp")
public class AdminFilter implements Filter {
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("你好呀");
		chain.doFilter(request, response);
	}
}
```
A.0
B.1
C.2
D.3
答案 B

# 题目7
（多选）关于过滤器链，下列说法正确的是（）

A.只有所有的过滤器都对请求进行了放行，请求才能访问到目标资源。
B.多个过滤器组成的一个整体我们称为过滤器链。
C.过滤器链中的过滤器是并行执行的。
D.即使其中一个过滤器没有放行，这个过滤器后面的过滤器还是会照常执行。
答案 AB

# 题目8
（多选）现在要访问一个servlet，该servlet被过滤器1和过滤器2拦截，以下说法正确的是（）

A.过滤器1放行之后，过滤器2不放行，也可以直接访问到该servlet
B.过滤器1、过滤器2放行之后，才能访问到该servlet
C.过滤器1放行之后，去到过滤器2，过滤器2放行之后，去到servlet，整个过滤器链已经完成
D.过滤器1放行之后，去到过滤器2，过滤器2放行之后，去到servlet，走完该servlet后又会回到过滤2，再到过滤器1

答案： BC

