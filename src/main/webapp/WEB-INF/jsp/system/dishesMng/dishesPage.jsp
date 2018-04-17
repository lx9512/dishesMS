<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/7
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<a href="/dishes/jumpAdd">新建菜品</a>
<table>
    <thead>
    <tr>
        <td>图片</td>
        <td>菜品名称</td>
        <td>菜品类别</td>
        <td>辣度</td>
        <td>价格(元)</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="dishes" items="${dishesList}">
        <tr>
            <td><img src="${dishes.photoPath}"></td>
            <td>${dishes.name}</td>
            <td>${dishes.dishesVariety.name}</td>
            <td>${dishes.acridity}</td>
            <td>${dishes.price}</td>
            <td>
                <a href="/dishes/jumpEdit?id=${dishes.id}">编辑</a>
                <a href="/dishes/drop?id=${dishes.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
