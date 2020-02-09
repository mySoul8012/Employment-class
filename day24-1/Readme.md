# 第一题
1.(多选)以下关于Cookie的说法，正确的是:()
A.Cookie是服务器端的会话技术
B.Cookie将服务器端传递过来的数据以文本文件保存在客户端
C.Cookie可以通过键获取对应的值，例如cookie.getValue(String key)
D.设置Cookie的过期时间，只要重新创建一个新的Cookie，然后新Cookie的名字与旧Cookie的名字一致，并将新cookie的maxAge设置为0，添加到客户端即可。
BCD
session是服务端回话技术

# 第二题
2.(多选)关于Cookie的API，以下说法正确的是:()
A.Cookie(String name, String value)   通过有参构造创建cookie对象
B.void addCookie(Cookie cookie)    使用request对象 将cookie发送给客户端
C.Cookie[] getCookies()    获取浏览器发送的cookie
D. Cookie 调用String getName()   获取cookie的值
AD

# 第三题
3.(多选)在a项目下，有以下一个servlet，说法正确的是:()
```
@WebServlet(name="demo",urlPatterns= "/demo")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
Cookie c = new Cookie("cookieName","cookieValue");   ①
		c.setPath("/a/demo2");                                     ②
		response.addCookie(c);                                     ③
	}	
```
A.执行①的时候，创建一个名字为cookieName，值为cookieValue的Cookie
B.执行②的时候，设置了cookie的访问路径
C.在③处，应该使用request对象去执行addCookie(Cookie cookie)的方法
D.执行完该servlet之后，在a项目下的任意一个servlet都可以获取到该Cookie
AB

# 第四题
(多选)关于session，以下说法正确的是()
A.Session是将会话数据保存在服务器端
B.Session也是一个域对象，所有用户共享域里面的信息
C.Session是服务器端的会话技术，cookie是浏览器端的会话技术
D.Session存储数据内容的大小没有限制，Cookie存储数据有限制，单个cookie不能超过4K
ABCD

# 第五题
不关闭浏览器依次访问下面的两个servlet，以下说法正确的是()
```
@WebServlet(name="demo",urlPatterns= "/demo")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

    		HttpSession session = request.getSession();               ①
    		session.setAttribute("sessionName", "sessionValue");    ②
    	}
```
```angular2html
@WebServlet("/demo2")
public class Demo2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		HttpSession session = request.getSession();                  ③
		System.out.println(session.getAttribute("sessionName"));  ④
	}
```

A.执行①处代码的时候，获取到一个session对象
B.执行②处代码的时候，将一个键为“sessionName”，值为“sessionValue”的键值对存到session域里面
C.①处产生的session对象和③处产生的session对象不是同一个session对象
D.  执行④处代码的时候，从session域里面获取键为“sessionName”对应的值，拿	到“sessionValue”，所以执行完④之后，输出“sessionValue”
ABD

# 第六题
6.(多选)往session中存放的数据取不到了,是什么原因：()★
A.浏览器清掉cookie缓存了 
B.换了浏览器访问 
C.Session调用了invalidate方法	
D.Session过期销毁了 
ABCD

# 第七题
