<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${contacts}" var="contact">
    <tr>
        <td>${contact.id}</td>
        <td>${contact.name}</td>
        <td>${contact.sex}</td>
        <td>${contact.age}</td>
        <td>${contact.address}</td>
        <td>${contact.email}</td>
    </tr>
</c:forEach>
</body>
</html>
