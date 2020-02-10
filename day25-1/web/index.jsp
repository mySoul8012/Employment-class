<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <%
   List<String> arr = new ArrayList<String>();
   // 进行添加
     arr.add("tom");
     arr.add("bob");
     arr.add("xiaoxiao");
     // 保存到域中
     request.setAttribute("arr", arr);
     // 双列集合
     Map<String, Integer> map = new HashMap<>();
     // 进行添加
     map.put("小米", 888);
     map.put("xiaoxiao", 999);
     request.setAttribute("map", map);
 %>
<c:forEach items="${arr}" var="item">
  ${item}
</c:forEach>
  <br/>
  <c:forEach items="${map}" var="item">
    ${item.key} --- ${item.value}
  </c:forEach>
  </body>
</html>
