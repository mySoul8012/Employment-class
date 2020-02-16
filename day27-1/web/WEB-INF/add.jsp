<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/15
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/AddStudent" method="post">
     学号;<input type="text" name="id"/><br/>
    姓名: <input type="text" name="name"/><br/>
    性别: <input type="radio" name="sex" value="男" checked/>男
    <input type="radio" name="sex" value="女"/>女
    年龄: <input type="text" name="age" value=""/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
