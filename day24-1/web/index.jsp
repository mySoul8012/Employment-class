<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/8
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script src='https://code.jquery.com/jquery-3.2.1.min.js'></script>
  <body>
<form action="/loginServlet" method="post">
  用户名<input type="text" name="username"/>
  密码<input type="password" name="password"/>
  <img id="img" src="/CheckCode01">
  验证码；<input type="text" name="code"/>
  <input type="submit" value="提交"/>
</form>
  <script type="text/javascript">
    $("#img").click(() => {
      $("#img").attr("src", $("#img").attr("src") + "?" + new Date())
    })
  </script>
  </body>
</html>
