<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/17
  Time: 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
    </tr>
    <c:forEach items="${requestScope.list}" var="studentList">
    <tr>
        <td>${studentList.id}</td>
        <td>${studentList.name}</td>
        <td>${studentList.sex}</td>
        <td>${studentList.age}</td>
        <td><a href="${pageContext.request.contextPath}/update?id=${studentList.id}">修改</a></td>
        <td><a href="${pageContext.request.contextPath}/delete?id=${studentList.id}">删除</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
