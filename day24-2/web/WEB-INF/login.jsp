<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/Login">
    用户名<input type="text" name="username" value="<%=request.getAttribute("username")%>"/><br/>
    密码<input type="password" name="password" value="<%=request.getAttribute("password")%>"><br/>
    <input type="checkbox" name="remember"/>记住用户名<br/>
    <input type="submit" name="submit" value="登录"/>
</form>
</body>
</html>
