<%@ page import="java.util.Random" %>
<%@ page import="java.util.UUID" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 2:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String uuid = UUID.randomUUID() + "";
    // 添加进入uuid
    session.setAttribute("token", uuid);
%>
<form action="/LoginServlet02" method="post">
    <input type="hidden" name="token" value="${sessionScope.get("token")}"/>
    用户名: <input type="text" name="username" value=""/>
    密码: <input type="text" name="password" value=""/>
</form>
</body>
</html>
