1.(多选)请求信息分为以下哪几个部分()
A.请求行
B.请求头
C.响应头
D.请求体
ABD

2.(多选)get请求和post请求的区别()
A.get和post的数据长度都没有限制
B.get请求不包含请求体，post请求包含请求体
C.get请求数据暴露在地址栏，post请求不会
D.默认是使用get请求方式
ABCD

3.(多选)下面哪种方式发送的请求是get请求()
A.在地址栏输入地址后按回车访问 
B.通过html的a标签进行跳转 
C.提交了一个没有method属性的表单
D.提交一个method属性是post的表单
ABC

4.(多选)获取请求头的常用API()
A.String getMethod()  获取请求头上的请求方式
B.String getHeader(String name)  获取指定请求头的值
C.String getRequestURI()  获取请求头的资源名部分
D.Enumeration getHeaderNames()  获取此请求包含的所有头名称的枚举
BC

5.(多选)请求头可以携带哪些信息()		
A.浏览器的版本
B.用户传递过来的参数
C.用户访问的地址
D.http协议版本
ABCD

6 .(多选) 关于request的API，以下说法正确的是()
A.String getParameter(String name)  获取表单name属性对应的值
B.String getParameters(String name)  获取表单name属性对应的值
C.String[]getParameterValues(String name)  获取name相同的所有value
D.Map getParameterMap() 参数名作为key，参数值作为value，封装到map中。
ABCD

7.(多选)乱码的解决问题，页面向后台提交一个username的属性以及它对应的值是()
A.使用get方式提交数据的时候，可以通过request.setCharacterEncoding("utf‐8")的方式解决乱码问题
B.使用post方式提交数据的时候，可以通过request.setCharacterEncoding("utf‐8")的方式解决乱码问题
C.无论使用get方式还是post方式提交参数，页面使用的码表与request使用的码表必须要保持一致才不会出现乱码

D.提交参数对于页面使用编码没有要求
ABC

8.(单选)在Tomcat8.5环境下，分析代码，选择正确的选项()
```angular2html
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
String name = request.getParameter("username");
		String age = request.getParameter("age");
		response.getWriter().write("HelloWorld");
	}
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
```
A.如果是通过get方式提交,得到的中文参数是乱码的
B.如果是通过post方式提交，得到的中文参数是乱码的
C.如果通过post方式提交，得到的中文参数不会乱码
D.如果是通过get方式提交,得到的中文参数不会乱码
CD

9.(多选)关于request的API，以下说法正确的是()
A.String getParameter(String name)  获取表单name属性对应的值
B.String getContextPath()  获取项目路径
C.Object getAttribute(String name)  获取表单name属性对应的值
D.getRequestDispatcher(String path).forward(ServletRequest
request,ServletResponse response)  可以实现转发
ABCD

10.(多选)关于下面的代码，说法正确的是()
```angular2html
@WebServlet(name="demo",urlPatterns= "/demo")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setAttribute("testName", "testValue");           ①
		System.out.println(request.getAttribute("testName"));   ②
		request.removeAttribute("testName");                       ③
		System.out.println(request.getAttribute("testName"));   ④	
	}
```
A.执行完①后，可以向request域里面设置键为“testName”，值为”testValue”的键值对
B.执行②的时候，request从域里面获取键为“testName”对应的值，执行完②之后，输出“testValue”
C.执行③的代码的时候，从request域里面取键为“testName”对应的值
D.执行④的时候，request从域里面获取键为“testName”对应的值，执行完④之后，输出“testValue”
ABC

11.(多选)关于下面的这段代码，正说法确的是()
```angular2html
@WebServlet(name="demo",urlPatterns= "/demo")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		request.setAttribute("name", "test");
		request.getRequestDispatcher("/demo2").forward(request, response);	
	}
```
A.往request域里面设值名字是name值是test的键值对
B.可以在demo2对应的servlet里面通过request.getAttribute("test")获取到一个值的demo2
C.可以在demo2对应的servlet里面通过request.getParameter("name")获取到一个值的test
D.可以在demo2对应的servlet里面通过request.getAttribute("name")获取到一个值的test
AD

12.(单选)下面哪个选项可以获取请求方式()
A.request.getParameter("requestMethod");
B.request.getMethod();
C.request.getAttribute("requestMethod")
D.request.getHeader("requestMethod");

答案： B

1.(多选)关于response对象，下面说法正确的是()
A.response对象封装了浏览器发给服务器的信息
B.response对象封装了服务器给浏览器响应的信息
C.通过void setStatus(int sc)设置响应的状态码
D.通过void setHeader(String name,String value)用指定的名称和值设置响应头
ACD

2. (多选)请在下划线上补全下面代码，跳转到www.itcacst.cn网页()
```angular2html
@WebServlet(name="demo",urlPatterns= "/demo")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		____________补全代码___________________
	}
```
A.response.setHeader("refresh", "3;url=http://www.itcast.cn");
response.setStatus(200);3秒钟后跳转到www.itcast.cn页面
B.response.setHeader("location","http://www.itcast.cn");
response.setStatus(302);也可以实现跳转到www.itcast.cn页面
C.response.sendRedirect("http://www.itcast.cn");可以实现跳转到www.itcast.cn页面
D.A、B、C三个选项都可以实现页面的跳转，都不会改变地址栏地址
ABC

3.(单选)在网页上显示“你好，servlet”，请在下划线上补全下面代码()
```angular2html
@WebServlet(name="demo",urlPatterns= "/demo")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
         ________________补全代码_______________________;
		response.getWriter().write("你好，servlet");	
	}
```
A.request.setCharacterEncoding("utf-8")
B.response.setContentType("utf-8")
C.response.setContentType("text/html,charset=utf-8")
D.response.setContentType("text/html;charset=utf-8")

4. (多选)以下哪个是属于content-type的作用( )
A.设置repsonse使用的码表
B.通知浏览器使用指定的码表去解码
C.设置servlet使用的码表
D.设置request对获取请求参数使用的码表
BD

1.什么是请求转发? 请求转发的实现方式?
将该请求通过转发器，转发到下一个servlet。
使用方法为创建一个转发器
```angular2html
RequestDispatcher dispatcher = req.getRequestDispatcher("/six");
// 调用转发方法
dispatcher.forward(req, resp);
```
其中存储值，和设置值都是可以再次使用的
一次请求，两次转发

2.什么是重定向?重定向的实现方式?
重定向，一次请求，服务器返回一次，浏览器再次向服务器发送。
两次请求，两次相应。
重定向实现方式有三种
```
resp.setHeader("refresh", "3;url=http://www.baidu.com");
resp.setStatus(200);
```
```angular2html
resp.setHeader("location", "http://www.baidu.com");
resp.setStatus(302);
```
```angular2html
resp.sendRedirect("http://www.baidu.com")
```

3.请求转发与重定向的区别?
请求转发，浏览器发送一次请求，服务器进行两次跳转
重定向，浏览器发送两次跳转，