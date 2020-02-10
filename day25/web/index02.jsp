<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${3 < 4}" var="b" scope="session">
    111${b}
</c:if>
<c:forEach begin="1" end="5" step="1" var="i" varStatus="vs">
    xiaoxiao
    ${i}  --- ${vs.begin} --- ${vs.step} -- ${vs.end} -- ${vs.count} -- ${vs.index}
</c:forEach>
</body>
</html>
