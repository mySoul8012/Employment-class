<%@ page import="java.sql.DatabaseMetaData" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  $END$
  <%
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
    String time = simpleDateFormat.format(date);
    // time保存到域对象中
    request.setAttribute("time", time);
  %>
  <%=request.getAttribute("time")%>
  </body>
</html>
