<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/14
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/add.jsp">新增</a>${idOK}
<table border="1">
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <%--使用jstl的foreach标签遍历集合--%>
    <c:forEach items="${students}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.sex}</td>
            <td>${s.age}</td>
            <td>
                <a href="${pageContext.request.contextPath}/findStudent?id=${s.id}">修改</a>｜
                <a href="${pageContext.request.contextPath}/deleteStudent?id=${s.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
