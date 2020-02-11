<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/12
  Time: 1:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="0" end="10" step="2" var="i">
    ${i}
</c:forEach>
</body>
</html>
