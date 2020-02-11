<%@ page import="com.ming.Person" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 1:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person("xiaox", "xiaoxiao");
    Person person1 = null;
    request.setAttribute("p1", person);
    request.setAttribute("p2", person1);
%>
<c:if test="${empty requestScope.p1}" var="b" scope="session">
    aaaaa
</c:if>
<c:if test="${empty requestScope.p2}" var="b" scope="session">
    bbbbb
</c:if>
</body>
</html>
