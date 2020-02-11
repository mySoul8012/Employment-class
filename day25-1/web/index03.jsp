<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 1:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List list = new ArrayList();
    list.add("abc");
    list.add("ccc");
    request.setAttribute("list", list);
%>
<c:if test="${empty requestScope.list}" var="b" scope="session">
    bbbbb
</c:if>
</body>
</html>
