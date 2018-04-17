<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/6
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<h4>菜品种类管理</h4>
<a href="/dishesVariety/jumpAdd">新建菜品种类</a>
<table>
    <thead>
    <tr>
        <td>菜品种类名称</td>
        <td>种类描述</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="dishesVariety" items="${dishesVarieties}">
        <tr>
            <td>${dishesVariety.name}</td>
            <td>${dishesVariety.describe}</td>
            <td>
                <a href="/dishesVariety/jumpEditPage?id=${dishesVariety.id}">编辑</a>
                <a href="/dishesVariety/drop?id=${dishesVariety.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
