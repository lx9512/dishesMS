<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/4/14
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单页面</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td hidden>id</td>
        <td>序号</td>
        <td>订单号</td>
        <td>桌台号</td>
        <td>订单人姓名</td>
        <td>联系电话</td>
        <td>下单时间</td>
        <td>总金额</td>
        <td>订单状态</td>
        <td>操作</td>
        <td>收银员</td>
    </tr>
    </thead>
    <tbody>
    <%int num = 1; %>
    <c:forEach var="orderMain" items="${orderMainList}">
        <tr>
        <td hidden>${orderMain.id}</td>
        <td><%=num++ %></td>
        <td>${orderMain.id}</td>
        <td>${orderMain.table.areaName}${orderMain.table.number}</td>
        <td>${orderMain.customer.name}</td>
        <td>${orderMain.customer.tel}</td>
        <td>${orderMain.orderDate}</td>
        <td>${orderMain.money}</td>
        <td>
            <c:choose>
                <c:when test="${orderMain.orderStatus == 0 }">
                    未付款
                </c:when>
                <c:when test="${orderMain.orderStatus == 1}">
                    线上已付款
                </c:when>
                <c:when test="${orderMain.orderStatus == 2}">
                    前台已付款
                </c:when>
            </c:choose>
        </td>
        <td>
            <a href="#">查看详情</a>
            <c:if test="${orderMain.orderStatus == 0}">
                <a href="/Order/checkout?orderId=${orderMain.id}" onclick="window.alert('是否要结账')">结账</a>
            </c:if>
        </td>
        <td>
            <c:if test="${orderMain.orderStatus == 2}">
                ${orderMain.staff.name}(${orderMain.staff.account})
            </c:if>
        </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
