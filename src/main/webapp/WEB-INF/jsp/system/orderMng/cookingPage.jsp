<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/18
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>正在烹饪菜品列表</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>序号</td>
        <td>订单号</td>
        <td>桌台号</td>
        <td>菜品名称</td>
        <td>份数</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <% int num = 1;%>
    <c:forEach var="order" items="#{cookingOrders}">
        <tr>
            <td><%=num++%></td>
            <td>${order.orderInfoId}</td>
            <td>${order.order.orderMain.table.areaName}${order.order.orderMain.table.number}</td>
            <td>${order.order.dishes.name}</td>
            <td>${order.cookingNum}</td>
            <td><a href="#">上桌</a> </td><!-- 传订单id 及份数 -->
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
