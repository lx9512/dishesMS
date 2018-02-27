<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/2/26
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加菜品</title>
</head>
<body>
<form action="/dishes/add">
    <label>菜品名称</label>
    <input type="text" name="name"><br>
    <label>菜品类型</label>
    <select name="varietyId">
        <c:forEach var="dishesVariety" items="${varietyList}">
            <option value="${dishesVariety.id}">${dishesVariety.name}</option>
        </c:forEach>
    </select>
    <label>价格</label>
    <input type="text" name="price"><br>
    <label>辣度</label>
    <select name="acridity">
        <option value="0">不辣</option>
        <option value="1">微辣</option>
        <option value="2">中辣</option>
        <option value="3">重辣</option>
    </select>
    <input type="submit" value="提交">
</form>
</body>
</html>
