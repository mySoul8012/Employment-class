<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/17
  Time: 3:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/updateStudent">
    学号: <input type="text" name="id" value="${student.id}" readonly/>
    姓名: <input type="text" name="name" value="${student.name}"/>
    年龄： <input type="text" name="age" value="${student.age}"/>
    性别: <input type="radio" name="sex" value="男" ${student.sex == "男" ? "checked":""}>男
            <input type="radio" name="sex" value="女" ${student.sex == "女" ? "checked":""}> 女
    <input type="submit" value="提交" name="提交"/>
</form>
</body>
</html>
