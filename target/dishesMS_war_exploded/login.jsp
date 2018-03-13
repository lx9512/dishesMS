<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/1
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h4>Login Page</h4>
<form action="/staff/login" method="post">
    userName:<input type="text" name="userName"/>
    <br><br>
    password:<input type="password" name="password"/>
    <br><br>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
