<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/17
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>服务面板</title>
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
    <% int i = 1%>
    <c:forEach var="order" items="${servicePanelOrders}">

        <tr>
            <td><%=i++%></td>
            <td>${}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
