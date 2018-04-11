<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/2/24
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>
<html>
<head>
    <title>add staff</title>
</head>
<body>

    <form action="/staff/add">
        <label>员工号</label>
        <input type="text" id="account" name="account" /><br>
        <label>密码</label>
        <input type="password" id="password" name="password" /><br>
        <label>姓名</label>
        <input type="text" id="name" name="name" /><br>
        <label>性别</label><br>
        <input type="radio" name="gender" value="男" checked ><label>男</label>
        <input type="radio" id="" name="gender" value="女" ><label>女</label><br>
        <label>身份证号</label>
        <input type="text" name="idCard"><br>
        <label>电话号码</label>
        <input type="text" name="tel"><br>
        <label>电子邮箱</label>
        <input type="text" name="email"><br>
        <label>职位</label>
        <select name="roleId">
            <c:forEach var="role" items="${roles}">
                <option value="${role.getId()}">${role.getTitle()}</option>
            </c:forEach>

        </select>
        <input type="submit" value="提交">
    </form>
</body>
</html>
