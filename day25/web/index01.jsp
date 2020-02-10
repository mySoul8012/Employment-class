<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("ming", "ming");
    pageContext.setAttribute("addr", "xiao", PageContext.REQUEST_SCOPE);
    pageContext.setAttribute("addr", "xiaoxiao", PageContext.APPLICATION_SCOPE);
%>
${requestScope.addr}
${sessionScope.addr}
${applicationScope.addr}
${ming}
${ming}
${user}
${user.id}
${user.username}
${user.password}

</body>
</html>
