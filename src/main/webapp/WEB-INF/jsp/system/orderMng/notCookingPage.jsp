<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/16
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>烹饪列表</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>序号</td>
        <td>桌台号</td>
        <td>菜品名称</td>
        <td>总份数</td>
        <td>未烹饪份数</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <%int n = 1; %>
    <c:forEach var="order" items="${notCookingOrders}">
        <tr>
            <td><%=n++%></td>
            <td>${order.orderMain.table.areaName}${order.orderMain.table.number}</td>
            <td>${order.dishes.name}</td>
            <td>${order.number}</td>
            <td>${order.number - order.completeStatus}</td>
            <td><a href="#/">烹饪</a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
