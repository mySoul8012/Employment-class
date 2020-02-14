<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/bbs">
    请发表你的言论
    <input type="text" name="message"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
