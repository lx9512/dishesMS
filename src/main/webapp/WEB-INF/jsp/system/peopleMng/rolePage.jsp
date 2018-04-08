<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aa123
  Date: 2018/3/2
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>role page</title>
</head>
<body>
<h4>职位管理</h4>
<a href="/role/jumpAddPage">新建职位</a>
<br>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>职位名称</td>
        <td>职位描述</td>
        <td>操作</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="role" items="${roles}">
        <tr>
            <td>${role.id}</td>
            <td>${role.title}</td>
            <td>${role.describe}</td>
            <td>
                <a href="/role/jumpEditPage?id=${role.id}">编辑</a>
                <a href="/role/drop?id=${role.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
