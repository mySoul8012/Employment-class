<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/14
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateStudent" method="post">
    学号: <input type="hidden" name="id" value="${student.id}"/><br/>
    姓名: <input type="text" name="name" value="${student.name}/">
</form>
</body>
</html>
