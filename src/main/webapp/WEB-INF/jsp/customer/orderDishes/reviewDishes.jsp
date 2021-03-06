<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yzp
  Date: 2018/3/12
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.min.js"></script>

<html>
<body>
<div style="width: 100%">
    <jsp:include page="/customerJump/getTop"></jsp:include>
</div>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">菜品信息</h3>
    </div>
    <table class="table table-hover">
        <thead>
        </thead>
        <tbody>

        <c:forEach var="dishes" items="${DishesList}">
            <tr>
                <td  >
                <img src="images/r11.jpg" class="img-responsive" alt="not find" width="250" height="200" /></td>
                <td>${dishes.getId()}</td>
                <td>${dishes.getName()}</td>
                <td>${dishes.getPrice()}</td>
                <td>${dishes.getDishesVariety().getDescribe()}</td>
                <td>${dishes.getAcridity()>0?"辣":"不辣"}</td>
                <td>
                    <a href="/customer/orderDishes?id=${dishes.getId()}">点餐</a>
                </td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>