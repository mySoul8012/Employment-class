<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/15
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${students}" var="s">
    <tr>
        <td>${s.id}</td>
        <td>${s.name}</td>
        <td>${s.age}</td>
        <td>
            <a href="${pageContext.request.contextPath}/findStudent?id=${s.id}">修改</a>
            <a href="${pageContext.request.contextPath}/deleteStudent?id=${s.id}">删除</a>
        </td>
    </tr>
</c:forEach>
</body>
</html>
