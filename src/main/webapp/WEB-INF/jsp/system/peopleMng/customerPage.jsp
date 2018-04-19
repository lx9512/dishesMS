<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/18
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>会员管理</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>序号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>联系电话</td>
        <td>电子邮箱</td>
        <td>出生日期</td>
    </tr>
    </thead>
    <tbody>
    <% int number = 1; %>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><%=number++%></td>
            <td>${customer.name}</td>
            <td>${customer.gender}</td>
            <td>${customer.tel}</td>
            <td>${customer.email}</td>
            <td>${customer.birthDate}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
