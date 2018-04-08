<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/26
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<a href="/table/jumpAdd" class="btn btn-primary btn-lg" data-target="#myModal" data-toggle="modal">新建桌台</a>
<a class="btn btn-primary btn-lg" href="/table/jumpBatchAdd" data-target="#myModal" data-toggle="modal">批量新建桌台</a>

<table>
    <thead>
    <tr>
        <td>桌台号</td>
        <td>人数</td>
        <td>状态</td>
        <td>描述</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="table" items="${tables}">
        <tr>
            <td>${table.areaName}+${table.number}</td>
            <td>${table.peopleNum}</td>
            <td>${table.status}</td>
            <td>${table.describe}</td>
            <td>
                <a href="/table/edit?id=${table.id}">修改</a>
                <a href="/table/drop?id=${table.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>

