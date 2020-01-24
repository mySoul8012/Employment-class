# 题目1
1.(单选)test项目下有一个的servlet，访问该servlet的路径可以是()
```angular2html
<servlet>
  	<servlet-name>Demo</servlet-name>
  	<servlet-class>cn.itcast.web.Demo</servlet-class>
  </servlet>
  <servlet-mapping>
  	<servlet-name>Demo</servlet-name>
  	<url-pattern>/demo</url-pattern>
   </servlet-mapping>
```
A.localhost:8080/test/Demo
B.localhost:8080/test/demo
C.localhost:8080/test/Demo/demo
D.localhost:8080/demo

答案： B

# 题目2
servlet与普通的JAVA程序的区别()
A.servlet必须实现servlet接口
B.servlet必须在servlet容器(服务器)中运行
C.servlet程序可以接收用户请求参数以及向浏览器输出数据
D. 在创建servlet的时候，直接实现servlet接口即可在浏览器端直接访
答案： ABC

# 题目3
servlet3.0与servlet2.5的区别 () 
A.Servlet3.0新增了注解
B.Servlet3.0不用实现servlet接口了
C.Servlet3.0实现了servlet接口之后，需要在类上添加@WebServlet或者在web.xml文件上进行配置
D.Servlet3.0注解上的name相当于servlet2.5的web.xml中的url-pattern
答案： AC


# 题目4
访问项目名为test下面的servlet，以下路径正确的是 () 
```angular2html
@WebServlet(name="demo",urlPatterns= "/testDemo")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}
```
A.localhost:8080/test/demo
B.localhost:8080/test/testDemo
C.localhost:8080/testDemo
D.localhost:8080/test/test

答案： B

# 题目5
关于servletContext，下面说法，正确的是()
A.在servlet里面，通过this.getServletContext()  可以获取到ServletContext对象
B.setAttribute(String name,Object obj)  可以向ServletContext容器里面存入数据
C.getAttribute(String name)  从ServletContext容器里面移除指定的名称的数据
D.  removeAttribute(String name)  从ServletContext容器里面获取指定名称的数据

答案： AB

# 题目6
下面的两段代码，说法正确额是()
```angular2html
@WebServlet(name="demo",urlPatterns= "/demo")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		ServletContext demo1 = this.getServletContext();
demo1.setAttribute("testName", "testValue");            ①
		System.out.println(demo1.getAttribute("testName"));    ②	
	}
```

```angular2html
@WebServlet("/demo2")
public class Demo2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		ServletContext demo2 = getServletContext();
		System.out.println(demo2.getAttribute("testName"));   ③
		demo2.removeAttribute("testName");
		System.out.println(demo2.getAttribute("testName"));   ④
	}
```

A.执行①的时候，往servletContext域添加键为“testName”，值为“testValue”的键值对
B.执行②的时候，从servletContext域里面获取键为“testName”对应的值，执行完②之后，控制台输出“testName”
C.执行③的时候，从servletContext域里面获取键为“testName”对应的值，执行完③之后，控制台输出“testValue”
D.执行④的时候，从servletContext域里面获取键为“testName”对应的值，执行完④之后，控制台输出“testValue”

答案： AC

# 题目7
下面关于servletContext理解正确的是()
A.一个web项目可以创建多个不同的ServletContext对象
B.每次访问项目时都会创建一个ServletContext对象
C.ServletContext对象在项目启动的时候就会创建
D.ServletContext可以接收浏览器访问时携带的参数

答案： C

# 题目8
Servlet 生命周期
a. init 初始化方法，servlet 创建时调用
b. service 服务方法，当浏览器访问时调用。
c. destory 销毁方法，servlet从服务器中卸载时调用。

init 何时调用： 
    第一次访问该servlet时，会调用init方法。只会在第一次调用。
service 何时调用
    每次访问该servlet时，都会调用service方法。
destory何时调用
    从服务器中吧servlet所在项目卸载时，该servlet会调用销毁方法。
    正常关闭服务器时，servlet也会调用该销毁方法。
    
# 题目10
描述ServletContext生命周期
servlet容器在启动一个web应用时都会创建一个ServletContext对象，一个Web应用只有一个ServletContext对象，web应用下的所有servlet共享一个servletCOntext对象，通过这个ServletContext 对象访问此servlet容器内的各种资源。

# 题目11
(多选)请求信息分为以下哪几个部分()
A.请求行
B.请求头
C.响应头
D.请求体
答案： ABD

# 题目12
