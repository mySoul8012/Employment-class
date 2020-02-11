<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 1:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map map = new HashMap();
    map.put("k1", "aaa");
    map.put("k2", "bbb");
    request.setAttribute("map", map);
%>
<c:forEach items="${requestScope.map}" var="m">
    ${m.key} ---> ${m.value}
</c:forEach>
</body>
</html>
