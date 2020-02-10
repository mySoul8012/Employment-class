<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table,td,th{
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
        <%-- 进行集合遍历 --%>
        <tr>
            <c:forEach items="${contacts}" var="contact">
        <tr>
        <td>${contact.id}</td>
        <td>${contact.name}</td>
        <td>${contact.sex}</td>
        <td>${contact.address}</td>
        <td>33333</td>
        <td>${contact.email}</td>
        <td><a class="btn btn-default btn-sm" href="修改联系人.html">修改 </a>&nbsp;<a class="btn btn-default btn-sm" href="修改联系人.html">删除</a></td>
    </tr>
            </c:forEach>
        <tr>
            <td colspan="8" align="center"><a href="">添加联系人</a> </td>
        </tr>
    </table>
</div>
</body>
</html>
