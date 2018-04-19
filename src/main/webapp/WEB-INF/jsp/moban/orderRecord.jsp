<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/4/19
  Time: 3:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<html>
<head>
    <title>OrderRecord</title>
</head>
<body>
<div>
    <c:choose>
        <c:when test="${ OrderMains == null}">
            <div class="main-about-body">
                <span class="text-center"><p class="list-group-item-text" style="size: 500px;">你好！您还没有进行消费</p></span>
            </div>
        </c:when>
        <c:otherwise>
            <c:forEach var="orderMain" items="${OrderMains}">
                订单号：${orderMain.getId()}&nbsp;&nbsp;
                桌台号：${orderMain.getTableId()}&nbsp;&nbsp;
                点餐时间：${orderMain.getOrderDate()}&nbsp;&nbsp;
                结账时间：${orderMain.getCheckoutDate()}<br>&nbsp;&nbsp;&nbsp;&nbsp;
                <c:forEach var="order" items="${orderMain.getOrderInfo()}">
                    子订单号：${order.getId()}&nbsp;&nbsp;
                    份数：${order.getNumber()}&nbsp;&nbsp;
                    菜名：${order.getDishes().getName()}&nbsp;&nbsp;
                    价格：${order.getDishes().getPrice()}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </c:forEach>
                <p>金额：${orderMain.getMoney()}</p><br><br>
            </c:forEach>
        </c:otherwise>
    </c:choose>
</div>
</body>
</html>
