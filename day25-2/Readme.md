# 题目1
1.(多选)关于JSP，以下说法正确的是:()
A.Jsp页面既可以写Java代码，也可以写HTML代码
B.Jsp本质是servlet
C.Jsp不能使用request、response对象
D.Jsp页面可以直接写Java代码
答案： AB

# 题目2
2.(多选)以下说法正确的是:()
A.<!-- jsp的注释 -->这是jsp的注释
B.<% Java代码片段 %>这是jsp的脚本片段格式
C.<%!  书写Java代码  %> 这是jsp的脚本声明格式
D.<%= 表达式 %>这是jsp的脚本表达式

BCD

# 题目3
3(多选)jsp和servlet区别:()
A.Jsp本质就是一个servlet
B.Jsp本质时一个Html文件，servlet只能用来接收请求的
C.jsp第一次被访问时会被web容器翻译成servlet
D.每次访问jsp都会被web容器翻译成servlet
答案： AC

# 题目四
```
@WebServlet(name="demo",urlPatterns= "/el")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String [] strs = {"我","爱","Java"};
          request.setAttribute("myStrs", strs);                  ①
		__________________②______________________
	}
```

```angular2html
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${③}
</body>
</html>
```
A.①处的代码可以改为request.getSession().setAttribute("myStrs", strs);②处不填写代码，③处填写上myStrs[2]即可在页面上显示“Java”
B.没有修改①处代码，可以在②填写上response.sendRedirect("/1.jsp");③处填写上myStrs即可在页面上显示“Java”
C.在②处添加代码request.getRequestDispatcher("/1.jsp").forward(request, response);后，可以在③处填写上myStrs即可在页面上显示“Java”
D.在②处添加代码request.getRequestDispatcher("/1.jsp").forward(request, response);后，可以在③处填写上myStrs[2]即可在页面上显示“Java”

答案： AD

# 题目5
5.(单选)请看下面一段代码(User类的属性已经提供了getter/setter方法)，以下说法正确的是()
```angular2html
@WebServlet(name="demo",urlPatterns= "/el")
public class Demo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
List<String> list = new ArrayList<>();
		list.add("我");
		list.add("爱");
		list.add("java");
		request.setAttribute("mList", list);
		User u = new User("test",18);
		request.getSession().setAttribute("user", u);
		response.sendRedirect(request.getContextPath() + "/1.jsp");
	}		
}
```
A.在1.jsp页面上要显示“我”字，对应的EL表达式应该是:${mList}
B.在1.jsp页面上要显示“我”字，对应的EL表达式应该是:${mList[0]}
C.在1.jsp页面上要显示”test”，对应的EL表达式应该是:${user.name }
D.在1.jsp页面上要显示”test”，对应的EL表达式应该是:${u.name }
答案：C

# 题目6
6.(单选)下列关于JSTL中标签说法错误的是()
	
A.<c:choose>标签要和<c:when>标签配合使用。
B.可以用<c:forEach>标签对一个集合进行迭代。
C.<c:when>标签用于条件选择。
D.<c:if>标签用来进行条件判断。

答案 C

# 题目7
(单选)对于<c:forEach>标签，下列说法正确的是()

A.必须指定begin和end属性的值。
B.step属性用于指定迭代的步长，每次循环向后跳几个步，执行一次循环体中的内容。
C.该标签不能对存到session域里的数组进行迭代。
D.var属性保存了当前循环过程中的信息(循环的开始、结束、步长、次数等)。
答案： B

# 题目8
