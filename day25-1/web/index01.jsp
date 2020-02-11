<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 1:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${1 > 2}" var="b" scope="session">
    aaaa
</c:if>
<c:if test="${not b}" var="c" scope="session">
    bbbb
</c:if>
</body>
</html>
