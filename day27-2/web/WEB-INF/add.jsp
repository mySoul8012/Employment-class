<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/17
  Time: 2:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/AddStudent" method="post">
    学号<input type="text" name="id" value="" />
    姓名<input type="text" name="name" value=""/>
    年龄<input type="text" name="age" value=""/>
    性别<input type="radio" name="sex" value="男"/>女
    <input type="radio" name="sex" value="女"/>男
    <input type="submit" name="submit" value="提交"/>
</form>
</body>
</html>
