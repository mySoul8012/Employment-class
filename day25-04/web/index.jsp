<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 2:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/loginServlet" method="post">
    用户名: <input type="text" name="username" value="${cookie.get("username").value}"/>
    密码: <input type="password" name="password" value="${cookie.get("password").value}"/>
    <input type="checkbox" name="checkbox" value=""/>记住用户名
    <input type="submit" value="login" name="login"/>
  </form>
  </body>
</html>
