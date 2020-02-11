<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table, td, th{
            text-align: center;
        }
    </style>
</head>
<body>
<div align="center">
    <h3 style="text-align: center">显示所有联系人</h3>
    <table border="1">
        <tr class="success">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${contacts}" var="contact">
            <td>${contact.id}</td>
            <td>${contact.name}</td>
            <td>${contact.sex}</td>
        </c:forEach>
    </table>
</div>
</body>
</html>
