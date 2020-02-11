<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 1:35
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
    List<String> list = new ArrayList<>();
    list.add("aaaa");
    list.add("bbbb");
    request.setAttribute("list", list);
%>
<c:forEach items="${requestScope.list}" var="i">
    ${i}
</c:forEach>
</body>
</html>
