<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 5:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<form method="post" action="/AddUserUser">
  用户名；<input type="text" name="username" value=""/>
  密码: <input type="text" name="password" value=""/>
  <input type="hidden" name="token" value="<%=request.getAttribute("token")%>">
  <input type="submit" value="提交"/>
</form>
  </body>
</html>
